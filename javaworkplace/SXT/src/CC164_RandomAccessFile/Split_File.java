package CC164_RandomAccessFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/12/2.
 */
public class Split_File {
    //�ļ���·��
    private String filePath;
    //�ļ�������
    private String fileName;
    //�ļ���С
    private long length;
    //����
    private int size;
    //ÿ���С--byte
    private long blockSize;
    //ÿ�������
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
        //��׳��
        if(filePath==null||!((src=new File(filePath)).exists())){
            return;
        }
        if (src.isDirectory()){
            return;
        }

        //fileName
        this.fileName=src.getName();
        //���������û���С
        this.length=src.length();//����byte

        //����ÿ���С
        if (this.blockSize>length){
            this.blockSize=length;
        }

        //ȷ������-----Math.ceil:����ȡ������С�ڲ�������С����
        size=(int)Math.ceil(length/(this.blockSize*1.0));

    }

    private void initPathName(String destPath){
        for (int i=0;i<size;i++){
            this.blockName.add(destPath+"/"+this.fileName+".part"+i);
        }
    }

    /**
     * �ļ��ķָ�
     * @param destPath �ָ��ļ��Ĵ��Ŀ¼
     *  �ڼ���
     *  ��ʼλ��
    *   ʵ�ʴ�С
     */
    public void split(String destPath){
        //ȷ���ļ�·��
        initPathName(destPath);

        long beginPos=0;//��ʼ��
        long actualBlockSize=blockSize;//ʵ�ʴ�С
        //�������п��С,λ�ã�����
        for (int i=0;i<size;i++){
            //���һ���ʵ�ʴ�С
            if (i==size-1){
                actualBlockSize=length-beginPos;
            }
            splitDetail(i,beginPos,actualBlockSize);
            beginPos+=actualBlockSize;//λ�������
        }
    }

    /**
     * �ļ��ķָ�-����
     * @param idx
     * @param beginPos
     * @param actualBlockSize
     */
    public void splitDetail(int idx,long beginPos,long actualBlockSize){
        //1.Դ
        File src =new File(this.filePath);
        File dest=new File(this.blockName.get(idx));
        //2.��
        RandomAccessFile raf=null;
        BufferedOutputStream bos=null;
        try {
            raf=new RandomAccessFile(src,"r");
            bos=new BufferedOutputStream(new FileOutputStream(dest));
            //3.��ȡ�ļ�
            raf.seek(beginPos);
            //����
            byte [] flush=new byte[1024];
            //��ȡ����
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
     * �ϲ�--->�ļ���׷��
     * @param args
     */
    public void mergeFile(String destPath){
        //1.Դ
        File dest=new File(destPath);
        //2.��
        BufferedInputStream bis=null;
        BufferedOutputStream bos=null;
        for (int i=0;i<this.blockName.size();i++){
            try {
                bis=new BufferedInputStream(new FileInputStream(new File(blockName.get(i))));
                bos=new BufferedOutputStream(new FileOutputStream(dest,true));//��׷��

                //����
                byte [] flush=new byte[1024];
                //��ȡ����
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
        //�ָ�
        Split_File split=new Split_File("F:/others/split.txt",50);
        System.out.println(split.size);
        //�ָ�Ŀ�ĵ�
        split.split("F:/others");
        //�ϲ�
        split.mergeFile("F:/others/merge.java");
    }
}
