package Study.Day13;

import java.util.Scanner;

/**
 * @author Li
 */
public class TraversalString {
    public static void main(String[] args) {
        /*
            字符串遍历的几种方法:
                使用 charAt()
                        length()：返回此字符序列的长度。
                        charAt(int index)：返回指定索引处的char值。

                使用substring(i ,i+1)
                CharSequence subSequence( int beginIndex, int endIndex): 返回一个字符序列，该序列是该序列的子序列
                可以通过把beginIndex设定为i，而endIndex设定为i+1，这样每次也是获得一个字符
                String str="2017 fight";
                for(int i=0;i < str.length();i++) {
                    System.out.println(str.substring(i,i+1));
                }

                使用toCharArray()
                toCharArray()：将此字符串转换为字符数组

                使用getBytes()
                getBytes()：将String编码为一系列字节序列，然后存储到字节数组中
        * */

        /* 使用 charAt() */

        Scanner sc = new Scanner(System.in);
        System.out.println("输入一串数据:");
        String line = sc.nextLine();

        System.out.println(line.charAt(0));
        System.out.println(line.charAt(1));
        System.out.println(line.charAt(2));
        System.out.println("-------");
        // 优化:
        System.out.println("line.length:" + line.length());
        for (int i = 0; i < line.length(); i++) {
            System.out.println(line.charAt(i));
        }
    }
}
