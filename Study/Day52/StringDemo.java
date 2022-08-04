package Study.Day52;

import java.io.*;
import java.util.Arrays;

/**
 * @author Li
 */

/*
    常见的字符集
        ASCII字符集：
        ASCII：是基于拉丁字母的一套电脑编码系统，用于显示现代英语，主要包括控制字符(回车键、退格、换行键等)和可显示字符(英文大小写字符、阿拉伯数字和西文符号)
        基本的ASCII字符集，使用7位表示一个字符，共128字符。ASCII的扩展字符集使用8位表示一个字符，共256字符，方便支持欧洲常用字符。是一个系统支持的所有字符的集合，包括各国家文字、标点符号、图形符号、数字等
    GBXXX 字符集：
        GBK：最常用的中文码表。是在GB2312标准基础上的扩展规范，使用了双字节编码方案，共收录了21003个汉字，完全兼容GB2312标准，同时支持繁体汉字以及日韩汉字等
    Unicode字符集：
        UTF-8编码：可以用来表示Unicode标准中任意字符，它是电子邮件、网页及其他存储或传送文字的应用 中，优先采用的编码。互联网工程工作小组（IETF）要求所有互联网协议都必须支持UTF-8编码。它使用一至四个字节为每个字符编码
        编码规则：
        128个US-ASCII字符，只需一个字节编码
        拉丁文等字符，需要二个字节编码
        大部分常用字（含中文），使用三个字节编码
        其他极少使用的Unicode辅助字符，使用四字节编码

    小结：采用何种规则编码，就要采用对于的规则解码，否则就会出现乱码

*/

/*
    编码：
        byte[] getBytes()：使用平台的默认字符集将该 String编码为一系列字节，将结果存储到新的字节数组中
        byte[] getBytes(String charsetName)：使用指定的字符集将该 String编码为一系列字节，将结果存储到新的字节数组中

    解码：
        String(byte[] bytes)：通过使用平台的默认字符集解码指定的字节数组来构造新的 String
        String(byte[] bytes, String charsetName)：通过指定的字符集解码指定的字节数组来构造新的 String
 */

public class StringDemo {
    public static void main(String[] args) throws IOException {
        //定义一个字符串
        String s = "中国";

        //byte[] getBytes()：使用平台的默认字符集将该 String编码为一系列字节，将结果存储到新的字节数组中
        //byte[] bys = s.getBytes(); //[-28, -72, -83, -27, -101, -67]
        //byte[] getBytes(String charsetName)：使用指定的字符集将该 String编码为一系列字节，将结果存储到新的字节数组中
//        byte[] bys = s.getBytes("UTF-8"); //[-28, -72, -83, -27, -101, -67]
        byte[] bys = s.getBytes("GBK"); //[-42, -48, -71, -6]
        System.out.println(Arrays.toString(bys));

        //String(byte[] bytes)：通过使用平台的默认字符集解码指定的字节数组来构造新的 String
//        String ss = new String(bys);
        //String(byte[] bytes, String charsetName)：通过指定的字符集解码指定的字节数组来构造新的 String
//        String ss = new String(bys,"UTF-8");
        String ss = new String(bys,"GBK");
        System.out.println(ss);

        /*
            InputStreamReader：是从字节流到字符流的桥梁
                它读取字节，并使用指定的编码将其解码为字符
                它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集

            OutputStreamWriter：是从字符流到字节流的桥梁
                是从字符流到字节流的桥梁，使用指定的编码将写入的字符编码为字节
                它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集
        */

//        OutputStreamWriter​(OutputStream out) 创建一个使用默认字符编码的OutputStreamWriter。
//        OutputStreamWriter​(OutputStream out, String charsetName) 创建一个使用命名字符集的OutputStreamWriter。
//        FileOutputStream fos = new FileOutputStream("myCharStream\\osw.txt");

//        OutputStreamWriter osw = new OutputStreamWriter(fos);
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myCharStream\\osw.txt"));
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myCharStream\\osw.txt"),"UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myCharStream\\osw.txt"),"GBK");
        osw.write("中国");
        osw.close();

//        InputStreamReader​(InputStream in) 创建一个使用默认字符集的InputStreamReader。
//        InputStreamReader​(InputStream in, String charsetName) 创建一个使用命名字符集的InputStreamReader。
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("myCharStream\\osw.txt"));
        InputStreamReader isr = new InputStreamReader(new FileInputStream("myCharStream\\osw.txt"),"GBK");
        //一次读取一个字符数据
        int ch;
        while ((ch=isr.read())!=-1) {
            System.out.print((char)ch);
        }

        isr.close();
    }
}
