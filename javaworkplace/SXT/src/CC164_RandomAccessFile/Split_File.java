package CC164_RandomAccessFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/12/2.
 */
public class Split_File {
    //文件的路径
    private String filePath;
    //文件的名称
    private String fileName;
    //文件大小
    private long length;
    //块数
    private int size;
    //每块大小--byte
    private long blockSize;
    //每块的名称
    private List<String> blockName;

    public Split_File() {
        blockName =new ArrayList<>();
    }

    public Split_File(String filePath) {
        this(filePath,1024);
    }

    public Split_File(String filePath,long blockSize) {
        this();
        this.filePath=filePath;
        this.blockSize=blockSize;
        init();
    }

    public void init(){
        File src=null;
        //健壮性
        if(filePath==null||!((src=new File(filePath)).exists())){
            return;
        }
        if (src.isDirectory()){
            return;
        }

        //fileName
        this.fileName=src.getName();
        //计算块数与没块大小
        this.length=src.length();//返回byte

        //修正每块大小
        if (this.blockSize>length){
            this.blockSize=length;
        }

        //确定块数-----Math.ceil:向上取整，不小于参数的最小整数
        size=(int)Math.ceil(length/(this.blockSize*1.0));

    }

    private void initPathName(String destPath){
        for (int i=0;i<size;i++){
            this.blockName.add(destPath+"/"+this.fileName+".part"+i);
        }
    }

    /**
     * 文件的分割
     * @param destPath 分割文件的存放目录
     *  第几块
     *  起始位置
    *   实际大小
     */
    public void split(String destPath){
        //确定文件路径
        initPathName(destPath);

        long beginPos=0;//起始点
        long actualBlockSize=blockSize;//实际大小
        //计算所有块大小,位置，所有
        for (int i=0;i<size;i++){
            //最后一块的实际大小
            if (i==size-1){
                actualBlockSize=length-beginPos;
            }
            splitDetail(i,beginPos,actualBlockSize);
            beginPos+=actualBlockSize;//位置向后移
        }
    }

    /**
     * 文件的分割-拷贝
     * @param idx
     * @param beginPos
     * @param actualBlockSize
     */
    public void splitDetail(int idx,long beginPos,long actualBlockSize){
        //1.源
        File src =new File(this.filePath);
        File dest=new File(this.blockName.get(idx));
        //2.流
        RandomAccessFile raf=null;
        BufferedOutputStream bos=null;
        try {
            raf=new RandomAccessFile(src,"r");
            bos=new BufferedOutputStream(new FileOutputStream(dest));
            //3.读取文件
            raf.seek(beginPos);
            //缓冲
            byte [] flush=new byte[1024];
            //读取长度
            int len=0;
            while (-1!=(len=raf.read(flush))){
                if (actualBlockSize-len>=0){
                    bos.write(flush,0,len);
                    actualBlockSize-=len;
                }else {
                    bos.write(flush,0,(int)actualBlockSize);
                    break;
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bos.close();
                raf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    /**
     * 合并--->文件的追加
     * @param args
     */
    public void mergeFile(String destPath){
        //1.源
        File dest=new File(destPath);
        //2.流
        BufferedInputStream bis=null;
        BufferedOutputStream bos=null;
        for (int i=0;i<this.blockName.size();i++){
            try {
                bis=new BufferedInputStream(new FileInputStream(new File(blockName.get(i))));
                bos=new BufferedOutputStream(new FileOutputStream(dest,true));//可追加

                //缓冲
                byte [] flush=new byte[1024];
                //读取长度
                int len=0;
                while (-1!=(len=bis.read(flush))){
                        bos.write(flush,0,len);
                }
                bos.flush();
                bis.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {
        //分割
        Split_File split=new Split_File("F:/others/split.txt",50);
        System.out.println(split.size);
        //分割目的地
        split.split("F:/others");
        //合并
        split.mergeFile("F:/others/merge.java");
    }
}
