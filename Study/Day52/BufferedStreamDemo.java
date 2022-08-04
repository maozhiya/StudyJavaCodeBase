package Study.Day52;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Li
 */

/*
    字符缓冲流：
        BufferedWriter：将文本写入字符输出流，缓冲字符，以提供单个字符，数组和字符串的高效写入，可以指定缓冲区大小，或者可以接受默认大小。默认值足够大，可用于大多数用途
        BufferedReader：从字符输入流读取文本，缓冲字符，以提供字符，数组和行的高效读取，可以指定缓冲区大小，或者可以使用默认大小。 默认值足够大，可用于大多数用途

    构造方法：
        BufferedWriter(Writer out)
        BufferedReader(Reader in)
 */

/*
    字符缓冲流的特有功能
        BufferedWriter：
            void newLine()：写一行行分隔符，行分隔符字符串由系统属性定义

        BufferedReader：
            public String readLine()：读一行文字。
                结果包含行的内容的字符串，不包括任何行终止字符，如果流的结尾已经到达，则为null
 */

public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
        //BufferedWriter(Writer out)
//        FileWriter fw = new FileWriter("myCharStream\\bw.txt");
//        BufferedWriter bw = new BufferedWriter(fw);
//        BufferedWriter bw = new BufferedWriter(new FileWriter("myCharStream\\bw.txt"));
//        bw.write("hello\r\n");
//        bw.write("world\r\n");
//        bw.close();

        //BufferedReader(Reader in)
        BufferedReader br = new BufferedReader(new FileReader("myCharStream\\bw.txt"));

        //一次读取一个字符数据
//        int ch;
//        while ((ch=br.read())!=-1) {
//            System.out.print((char)ch);
//        }

        //一次读取一个字符数组数据
        char[] chs = new char[1024];
        int len;
        while ((len=br.read(chs))!=-1) {
            System.out.print(new String(chs,0,len));
        }

        br.close();

        /*
        字符缓冲流的特有功能
            BufferedWriter：
                void newLine()：写一行行分隔符，行分隔符字符串由系统属性定义

            BufferedReader：
                public String readLine()：读一行文字。
                    结果包含行的内容的字符串，不包括任何行终止字符，如果流的结尾已经到达，则为null
        */

        /*
        //创建字符缓冲输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("myCharStream\\bw.txt"));

        //写数据
        for (int i = 0; i < 10; i++) {
            bw.write("hello" + i);
//            bw.write("\r\n");
            bw.newLine();
            bw.flush();
        }

        //释放资源
        bw.close();
        */

        //创建字符缓冲输入流
        BufferedReader br2 = new BufferedReader(new FileReader("myCharStream\\bw.txt"));

        //public String readLine()：读一行文字。
//        /*
//        //第一次读取数据
//        String line = br2.readLine();
//        System.out.println(line);
//
//        //第二次读取数据
//        line = br2.readLine();
//        System.out.println(line);
//
//        //在多读两次
//        line = br2.readLine();
//        System.out.println(line);
//
//        line = br2.readLine();
//        System.out.println(line);
//        */

        String line;
        while ((line=br2.readLine())!=null) {
            System.out.println(line);
        }

        br2.close();
    }
}
