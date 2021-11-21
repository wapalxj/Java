package c1_7_io.classTop;

import java.io.*;
import java.nio.channels.FileChannel;

public class WriterAndStream {

    private static void testWriterAndStream() {
        try {

            BufferedWriter bufferedWriter = new BufferedWriter(
            		//FileWriter对下面的代码进行了封装
//					new FileWriter("src/c1_7_io/testtxt/writerAndStream.txt"));
                    new OutputStreamWriter(
                            new FileOutputStream(
                                    new File("src/c1_7_io/testtxt/writerAndStream.txt")),
                            "GBK"));

            bufferedWriter.write("WriterAndStream");
            bufferedWriter.flush();
            bufferedWriter.close();
            System.out.println("end");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void testReadAndStream() {
        try {

            BufferedReader bufferedReader = new BufferedReader(
            		//FileWriter对下面的代码进行了封装
//					new FileReader("src/c1_7_io/testtxt/writerAndStream.txt"));
                    new InputStreamReader(
                            new FileInputStream(
                                    new File("src/c1_7_io/testtxt/writerAndStream.txt")),
                            "GBK"));

            String line = bufferedReader.readLine();
            bufferedReader.close();
            System.out.println(line);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//		testWriterAndStream();
        testReadAndStream();
    }

}
