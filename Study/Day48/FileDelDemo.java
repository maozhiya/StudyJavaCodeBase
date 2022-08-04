package Study.Day48;

import java.io.File;

/**
 * @author Li
 */

/*
    File类删除功能：
        public boolean delete()：删除由此抽象路径名表示的文件或目录
 */

public class FileDelDemo {
    public static void main(String[] args) {
        // File f1 = new File("D:\\AllTheCode\\Java\\Demo\\java.txt");

        // 需求1：在当前模块目录下创建java.txt文件
        File f1 = new File("myFile\\java.txt");
        /* System.out.println(f1.createNewFile());*/

        // 需求2：删除当前模块目录下的java.txt文件
        System.out.println(f1.delete());
        System.out.println("--------");

        //需求3：在当前模块目录下创建 java 目录
        File f2 = new File("myFile\\java");
        /* System.out.println(f2.mkdir()); */

        //需求4：删除当前模块目录下的itcast目录
        System.out.println(f2.delete());
        System.out.println("--------");

        //需求5：在当前模块下创建一个目录java,然后在该目录下创建一个文件java.txt
        File f3 = new File("myFile\\java");
        /* System.out.println(f3.mkdir());*/
        File f4 = new File("myFile\\java\\java.txt");
        /* System.out.println(f4.createNewFile());*/

        //需求6：删除当前模块下的目录 java
        System.out.println(f4.delete());
        System.out.println(f3.delete());
    }
}
