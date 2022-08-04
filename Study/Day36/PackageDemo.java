package Study.Day36;

/**
 * @author Li
 */

/*  装箱与拆箱
        装箱： 把基本类型转换为包装类的过程就是装箱
        拆箱： 把包装类转换为基本数据类型就是拆箱

    为了减少开发人员的工作，Java提供了自动拆装箱功能
        自动装箱： 将基本数据类型自动转化为对应的包装类
        自动拆箱： 将包装类自动转化成对应的基本数据类型

    自动拆装箱的实现原理
        自动装箱都是通过包装类的valueOf方法实现的
        自动装箱都是通过包装类对象xxxValue方法实现的(如intValue)
    自动拆装箱使用场景
        1.将基本类型放入集合类
            集合类中都是对象类型，但是我们add(基本数据类型)也不会报错，是因为Java给我们做了自动装箱
        2.包装类型和基本类型比较大小
            包装类与基本数据类型进行比较运算，先将包装类进行拆箱成基本数据类型，然后比较
        3.包装类型的运算
            对两个包装类型进行运算，会将包装类型自动拆箱为基本类型进行
        4.三目运算符的使用
        5.函数参数与返回值

    自动拆装箱与缓存
        Integer操作引入了新功能来节省内存和提高性能
            1.适用于整数区间-128~+127
            2.只适用于自动装箱，使用构造函数创建对象不适用
            3.只适用于整形，浮点型不行

    自动拆装箱带来的问题
        1.包装对象之间的数值比较不能简单的使用==，除了特殊情况(如Integer的-128~127),其他比较都需要使用equals比较
        2.如果包装类对象为NULL，那么自动拆箱就可能会抛出NPE
        3.如果一个for循环中有大量拆装箱操作，会浪费很多资源

*/

public class PackageDemo {
    public static void main(String[] args) {
        // 装箱： 把基本类型转换为包装类的过程就是装箱
        Integer i = Integer.valueOf(100);
        System.out.println("i:" + i);
        // 自动装箱： 将基本数据类型自动转化为对应的包装类
        /** 底层: Integer.valueOf(200); */
        Integer ii = 200;
        System.out.println("ii:" + ii);
        // 拆箱： 把包装类转换为基本数据类型就是拆箱
        ii = ii.intValue() + 100;
        System.out.println("ii:" + ii);
        // 自动拆箱： 将包装类自动转化成对应的基本数据类型
        /** 底层: ii.intValue() + 100; */
        ii += 100;
        System.out.println("ii:" + ii);

        Integer iii = null;
        // iii += 300;  NullPointerException
        if (iii != null) {
            iii += 300;
        }
        System.out.println("iii:" + iii);
    }
}
