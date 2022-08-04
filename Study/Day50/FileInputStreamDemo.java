package Study.Day50;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Li
 */

/*
    需求：
        把文件fos.txt中的内容读取出来在控制台输出

    FileInputStream：从文件系统中的文件获取输入字节
        FileInputStream(String name)：通过打开与实际文件的连接来创建一个FileInputStream,该文件由文件系统中的路径名name命名

    使用字节输入流读数据的步骤：
        1:创建字节输入流对象
        2:调用字节输入流对象的读数据方法
        3:释放资源
 */

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        //FileInputStream(String name)
        FileInputStream fis = new FileInputStream("myByteStream\\fos.txt");

        //调用字节输入流对象的读数据方法
        //int read()：从该输入流读取一个字节的数据

        /*
        //第一次读取数据
        int by = fis.read();
        System.out.println(by);
        System.out.println((char)by);

        //第二次读取数据
        by = fis.read();
        System.out.println(by);
        System.out.println((char)by);

        //再多读取两次
        by = fis.read();
        System.out.println(by);
        by = fis.read();
        System.out.println(by);

        //如果达到文件的末尾， -1
        */

        /*
        int by = fis.read();
        while (by != -1) {
            System.out.print((char)by);
            by = fis.read();
        }
        */

        //优化上面的程序
        int by;
        /*
            fis.read()：读数据
            by=fis.read()：把读取到的数据赋值给by
            by != -1：判断读取到的数据是否是-1
         */
        while ((by=fis.read())!=-1) {
            System.out.print((char)by);
        }


        //释放资源
        fis.close();


        /*
            需求：把文件fos.txt中的内容读取出来在控制台输出

            使用字节输入流读数据的步骤：
                1:创建字节输入流对象
                2:调用字节输入流对象的读数据方法
                3:释放资源
         */
        //创建字节输入流对象
        FileInputStream fis2 = new FileInputStream("myByteStream\\fos.txt");

        //调用字节输入流对象的读数据方法
        //int read​(byte[] b)：从该输入流读取最多 b.length个字节的数据到一个字节数组
        /*
        byte[] bys = new byte[5];

        //第一次读取数据
        int len = fis2.read(bys);
        System.out.println(len);
        //String​(byte[] bytes)
//        System.out.println(new String(bys));
        System.out.println(new String(bys,0,len));

        //第二次读取数据
        len = fis.read(bys);
        System.out.println(len);
//        System.out.println(new String(bys));
        System.out.println(new String(bys,0,len));

        //第三次读取数据
        len = fis.read(bys);
        System.out.println(len);
        //String​(byte[] bytes, int offset, int length)
        System.out.println(new String(bys,0,len));

        //再多读取两次
        len = fis2.read(bys);
        System.out.println(len);
        len = fis2.read(bys);
        System.out.println(len);
        */

        /*
            hello\r\n
            world\r\n

            第一次：hello
            第二次：\r\nwor
            第三次：ld\r\nr

         */

        //1024及其整数倍
        byte[] bys = new byte[1024];
        int len;
        while ((len=fis2.read(bys))!=-1) {
            System.out.print(new String(bys,0,len));
        }

        //释放资源
        fis2.close();
    }
}
