package Study.Day12;

/**
 * @author Li
 */

/*
            public String()	创建一个空白字符串对象，不含有任何内容
            public String(char[] chs)	根据字符数组的内容，来创建字符串对象
            public String(byte[] bys)	根据字节数组的内容，来创建字符串对象
            String s = “abc”;	直接赋值的方式创建字符串对象，内容就是abc
* */

/*
*   String 特点:
*       不可变, 值在创建后不能被更改
*       String 值不可更改, 但可以被共享   --(底层维护了一个字符串常量池，实现共享)
*       String 效果相当于数组( char[] --- JDK8 以前), 但底层原理是字节数组( byte[] --- JDK9以后 )
*       String类是被final修饰的，是不能被继承的
* */

public class StringDemo {
    public static void main(String[] args) {
        // public String()	创建一个空白字符串对象，不含有任何内容
        String s1 = new String();
        System.out.println("s1:" + s1);

        // public String(char[] chs)	根据字符数组的内容，来创建字符串对象
        char[] chs = {'L', 'i'};
        String s2 = new String(chs);
        System.out.println("s2:" + s2);
        /** 比较构造方法的方式得到对象 */
        String s22 = new String(chs);
        System.out.print("s2 == s22:");
        System.out.println(s2 == s22);

        // public String(byte[] bys)	根据字节数组的内容，来创建字符串对象
        byte[] bys = {97, 98, 99};
        String s3 = new String(bys);
        System.out.println("s3:" + s3);

        // String s = “abc”;	直接赋值的方式创建字符串对象，内容就是abc
        String s4 = "Li";
        System.out.println("s4:" + s4);
        /** 直接赋值的方式得到对象 */
        String s44 = "Li";
        System.out.print("s4 == s44:");
        System.out.println(s4 == s44);

        /** 比较字符串对象地址是否相同 */
        System.out.print("s2 == s4:");
        System.out.println(s2 == s4);

        /*
            String 对象的特点:
        * */

        /*
            字符串的比较:
                使用 == 作比较
                    基本类型: 比较的是数据值是否相同
                    引用类型: 比较的是地址值是否相同

                字符串是对象, 比较内容是否相同, 是通过 equals() 方法来实现
                public boolean equals(Object obj)
                equals方法实现了对非空对象引用的一个等价关系:
                    它是空的自反：对于任何非空的参考价值x，x.equals(x)应该返回true。
                    它是空的对称的：对于任何非空的参考值x和y，x.equals(y)应该返回true当且仅当y.equals(x)返回true。
                    它是空的传递：对于任何非空的参考值x，y，和z，如果x.equals(y)返回true和y.equals(z)返回true，然后x.equals(z)应该返回true。
                    它是空的一致的：对于任何非空的参考值x和y，多次调用x.equals(y)始终返回true或始终返回false，没有提供信息用于equals比较对象被修改。
                    对于任何非空的参考价值x，x.equals(null)应该返回false。
                这类Object equals方法实现对象上差别可能性最大的等价关系；就是说，对于任何非空的参考值x和y，此方法返回true当且仅当x和y引用同一个对象（x == y有价值true）。
                请注意，它一般是必要覆盖hashCode方法重写此方法，以保持对hashCode方法的一般合同，即平等的对象必须具有相等的散列码。

        * */
        System.out.print("s2.equals(s22):");
        System.out.println(s2.equals(s22));
        System.out.print("s2.equals(s4):");
        System.out.println(s2.equals(s4));
        System.out.print("s4.equals(s44):");
        System.out.println(s4.equals(s44));

    }
}
