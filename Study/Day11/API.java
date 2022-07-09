package Study.Day11;

import java.util.Scanner;

/**
 * @author Li
 */
public class API {
    public static void main(String[] args) {
        /*
            初识 API: (Application Programming Interface,应用程序编程接口)
            是一些预先定义的接口，目的是提供应用程序与开发人员基于某软件或硬件的以访问一组例程的能力，而又无需访问源码，或理解内部工作机制的细节。
        * */
        /*
            Random: 这个类的一个实例是用于生成伪随机数流。该类使用一个48位的种子，这是使用线性同余公式的修正
            Class Random
            java.lang.Object
                java.util.Random
            构造方法    Constructor and Description
                Random()
                创建一个新的随机数发生器。
                Random(long seed)
                使用一个单一的 long种子创造了一种新的随机数发生器。

            boolean nextBoolean()
            返回下一个伪随机、均匀分布的 boolean价值从这个随机数生成器的序列。

            void nextBytes(byte[] bytes)
            产生随机字节，并将它们放置到提供的字节数组中。

            double nextDouble()
            返回下一个伪随机、均匀分布的 double价值 0.0和 1.0之间从这个随机数生成器的序列。

            float nextFloat()
            返回下一个伪随机、均匀分布的 float价值 0.0和 1.0之间从这个随机数生成器的序列。

            double nextGaussian()
            返回下一个伪随机，高斯（“正常”）的分布式 double均值和标准偏差值 0.0 1.0从这个随机数生成器的序列。

            int nextInt()
            返回下一个伪随机、均匀分布的 int价值从这个随机数生成器的序列。

            int nextInt(int bound)
            返回一个随机、均匀分布的 int值在0（含）和指定值（独家），从这个随机数发生器的顺序绘制。

            long nextLong()
            返回下一个伪随机、均匀分布的 long价值从这个随机数生成器的序列。

            void setSeed(long seed)
            集种子这个随机数发生器使用一个单一的 long种子。
        * */

        /*
            Scanner:
                一个简单的文本扫描程序，可以使用正则表达式解析原始类型和字符串。
                一个Scanner打破它的输入令牌使用分隔符模式，默认匹配空格。由此产生的令牌，然后可以转换成价值的不同类型使用不同的next方法。

            byte nextByte()
            int nextInt()
            long nextLong()
            short nextShort()
            float nextFloat()
            double nextDouble()
            boolean nextBoolean()
            String nextLine()
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串数据: ");
        // Ctrl + Alt + V
        String line = sc.nextLine();
        System.out.println("输入的数据是:" + line);
    }
}
