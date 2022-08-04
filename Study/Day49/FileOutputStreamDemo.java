package Study.Day49;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Li
 */

/*
    FileOutputStream：文件输出流用于将数据写入File
        FileOutputStream​(String name)：创建文件输出流以指定的名称写入文件
 */

/*
    FileOutputStream：文件输出流用于将数据写入File
        FileOutputStream​(String name)：创建文件输出流以指定的名称写入文件
 */

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
        //FileOutputStream​(String name)：创建文件输出流以指定的名称写入文件
        FileOutputStream fos = new FileOutputStream("myByteStream\\fos.txt");
        /*
            做了三件事情：
                A:调用系统功能创建了文件
                B:创建了字节输出流对象
                C:让字节输出流对象指向创建好的文件
         */

        //void write​(int b)：将指定的字节写入此文件输出流
        fos.write(97);
//        fos.write(57);
//        fos.write(55);

        //最后都要释放资源
        //void close​()：关闭此文件输出流并释放与此流相关联的任何系统资源。
        fos.close();


        //创建字节输出流对象
        //FileOutputStream​(String name)：创建文件输出流以指定的名称写入文件
        FileOutputStream fos1 = new FileOutputStream("FileDemo\\fos1.txt");
        /*
            做了三件事情：
                A:调用系统功能创建了文件
                B:创建了字节输出流对象
                C:让字节输出流对象指向创建好的文件
         */

        //void write​(int b)：将指定的字节写入此文件输出流
        fos1.write(97);
//        fos1.write(57);
//        fos1.write(55);


        /* 最后都要释放资源 void close​()：关闭此文件输出流并释放与此流相关联的任何系统资源。*/

        fos.close();

        /*
            构造方法：
                FileOutputStream​(String name)：创建文件输出流以指定的名称写入文件
                FileOutputStream​(File file)：创建文件输出流以写入由指定的 File对象表示的文件

            写数据的三种方式：
                void write​(int b)：将指定的字节写入此文件输出流
                一次写一个字节数据

                void write​(byte[] b)：将 b.length字节从指定的字节数组写入此文件输出流
                一次写一个字节数组数据

                void write​(byte[] b, int off, int len)：将 len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流
                一次写一个字节数组的部分数据
        */
        //FileOutputStream​(String name)：创建文件输出流以指定的名称写入文件
        FileOutputStream foss = new FileOutputStream("FileDemo\\foss.txt");
        //new File(name)
//        FileOutputStream foss = new FileOutputStream(new File("FileDemo\\foss.txt"));

        //FileOutputStream​(File file)：创建文件输出流以写入由指定的 File对象表示的文件
//        File file = new File("FileDemo\\foss.txt");
//        FileOutputStream fos2 = new FileOutputStream(file);
//        FileOutputStream fos2 = new FileOutputStream(new File("FileDemo\\foss.txt"));

        //void write​(int b)：将指定的字节写入此文件输出流
//        foss.write(97);
//        foss.write(98);
//        foss.write(99);
//        foss.write(100);
//        foss.write(101);

//        void write​(byte[] b)：将 b.length字节从指定的字节数组写入此文件输出流
//        byte[] bys = {97, 98, 99, 100, 101};
        //byte[] getBytes​()：返回字符串对应的字节数组
        byte[] bys = "abcde".getBytes();
//        foss.write(bys);

        //void write​(byte[] b, int off, int len)：将 len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流
//        foss.write(bys,0,bys.length);
        foss.write(bys,1,3);

        //释放资源
        foss.close();
    }
}
