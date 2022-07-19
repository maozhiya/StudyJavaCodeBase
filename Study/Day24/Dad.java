package Study.Day24;

/**
 * @author Li
 */

/*
* 状态修饰符分类:
*   .final(最终态)
    .static(静态)
*
*   final:
*       可以修饰成员方法，成员变量，类
*   final特点（相当于被结渣了，不可生娃，不可被赋值了）
*       .final 修饰成员变量，则这个变量就是常量，不可赋值，
        .final 修饰成员方法，则这个方法不可被重写，重载，
        .final 修饰类，则这个类就不能被继承
*   final修饰局部变量
*       .基本数据类型的变量：final修饰指的是基本数据的数据值不能发生改变；
        .引用数据类型的变量：final修饰指的是引用数据类型的地址值不能发生改变，但是地址值里面的内容是可以发生改变的；
*
*   static:
*       可以修饰 成员方法，成员变量
*   static特点:
*       .被类的所有对象共享（这是我们是否使用静态关键字的条件）
        .可以通过类名调用，也可以通过对象名调用，，，推荐使用类名调用
*   static静态的访问特点:
*       非静态的成员方法
            .能访问静态的成员变量
            .能访问非静态的成员变量
            .能访问静态的成员方法
            .能访问非静态的成员方法
*       静态的成员方法
            .能访问静态的成员变量
            .能访问静态的成员方法
*   静态成员方法只能访问静态成员
*
* */

public class Dad {
    public String dress = "YiBin";
    public int age = 17;
    String name = "Xi";

    public final void method() {
        System.out.println("Dad method");
    }
}
