package Study.Day15;

/**
 * @author Li
 */

/*
    Constructor and Description
        StringBuilder()
        构造一个没有字符的字符串生成器，并构造了16个字符的初始容量。

        StringBuilder(CharSequence seq)
        构建一个包含指定的 CharSequence相同字符的字符串生成器。

        StringBuilder(int capacity)
        构造一个字符串生成器没有字符和一个初始容量的 capacity参数指定。

        StringBuilder(String str)
        构造一个初始化为指定字符串的内容的字符串生成器。
* */

public class StringBuilderDemo {
    public static void main(String[] args) {
        /*  String +=:
                OX001: Hello
                OX002: World
                OX003: HelloWorld
            底层其实是编译器擅自调用了 StringBuilder 类进行+的操作
            主要原因是 StringBuilder 的 append() 更加高效
            通过new创建的字符串对象，每一次new都会申请一个内存空间，虽然内容相同，但是地址值不同
        * */
        String s = "Hello";
        s += "World";
        System.out.println(s);
        String s1 = "1";
        String s2 = "1";
        System.out.println(s1.equals(s2));
        // StringBuilder()
        StringBuilder sb = new StringBuilder();
        System.out.println("sb:" + sb);
        System.out.println("sb.length:" + sb.length());
        // StringBuilder(String str)
        StringBuilder sb1 = new StringBuilder("Li");
        System.out.println("sb1:" + sb);
        System.out.println("sb1.length:" + sb1.length());
        /*
            public StringBuilder append(任意类型)
            添加任意参数数据，并返回对象本身
            注意：返回的是对象本身，则调用过append方法后的对象与之前创建的对象是同一个对象，并且调用方法后的对象依旧是对象，可以再次调用方法
        * */
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb22 = sb2.append("Hello");
        System.out.println("sb2:" + sb2);
        System.out.println("sb22:" + sb22);
        System.out.println("sb2 == sb22:" + (sb2 == sb22));
        System.out.println("append(任意类型)");
        sb2.append("World");
        sb2.append("Java");
        System.out.println("sb2:" + sb2);
        System.out.println("sb22:" + sb22);
        // 链式编程
        System.out.println("链式编程");
        sb2.append("---").append("Hello").append("World").append("Java");
        System.out.println("sb2:" + sb2);
        /*
            public StringBuilder reverse()
            返回反序遍历的字符串
        * */
        sb2.reverse();
        System.out.println("sb2.reverse():" + sb2);
    }
}
