package Study.Day48;

import java.io.File;
import java.io.IOException;

/**
 * @author Li
 */

/*
    File类创建功能：
        public boolean createNewFile()：当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件
            如果文件不存在，就创建文件，并返回true
            如果文件存在，就不创建文件，并返回false

        public boolean mkdir()：创建由此抽象路径名命名的目录
            如果目录不存在，就创建目录，并返回true
            如果目录存在，就不创建目录，并返回false

        public boolean mkdirs()：创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录

 */

public class FileCreateDemo {
    public static void main(String[] args) throws IOException {
        //需求1：在D:\AllTheCode\Java\Demo目录下创建一个文件java.txt
        File f1 = new File("D:\\AllTheCode\\Java\\Demo\\java.txt");
        System.out.println(f1.createNewFile());
        System.out.println("--------");

        //需求2：在D:\AllTheCode\Java\Demo目录下创建一个目录JavaSE
        File f2 = new File("D:\\AllTheCode\\Java\\Demo\\JavaSE");
        System.out.println(f2.mkdir());
        System.out.println("--------");

        //需求3：在D:\AllTheCode\Java\Demo目录下创建一个多级目录JavaWEB\\HTML
        File f3 = new File("D:\\AllTheCode\\Java\\Demo\\JavaWEB\\HTML");
        /* System.out.println(f3.mkdir()); */
        System.out.println(f3.mkdirs());
        System.out.println("--------");

        //需求4：在D:\AllTheCode\Java\Demo目录下创建一个文件javaSE.txt
        File f4 = new File("D:\\AllTheCode\\Java\\Demo\\javaSE.txt");
        /* System.out.println(f4.mkdir()); */
        System.out.println(f4.createNewFile());
    }
}
