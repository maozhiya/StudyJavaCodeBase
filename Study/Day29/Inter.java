package Study.Day29;

/**
 * @author Li
 */

/*
    接口是隐式抽象的，当声明一个接口的时候，不必使用abstract关键字。
    接口中每一个方法也是隐式抽象的，声明时同样不需要abstract关键字。
    接口中的方法都是公有的。
*/

public interface Inter {
    /**
     * 成员变量只能是常量并且是静态公共的
     * 默认修饰符：public static final 关键字可以互相交换
     */
    public int num = 10;
    public final int num2 = 20;

    /** public static final int num3 = 30; */
    int num3 = 30;
    /** show 接口:    接口成员方法：只能是抽象方法  --默认修饰符：public abstract */
    void show();
    /** method 接口 */
    void method();

    /* 接口没有构造方法 */
    // public Inter() {}

    /*
        区别1：定义关键字不同
            接口使用关键字 interface 来定义。
            抽象类使用关键字 abstract 来定义。
        区别2：继承或实现的关键字不同
            接口使用 implements 关键字定义其具体实现。
            抽象类使用 extends 关键字实现继承。
        区别3：子类扩展的数量不同
            接口的实现类可以有多个
            而抽象类的子类，只能继承一个抽象类
        区别4：属性访问控制符不同
            接口中属性的访问控制符只能是 public (接口中的属性默认是 public static final 修饰的。)
            抽象类中的属性访问控制符无限制，可为任意控制符
        区别5：方法控制符不同
            接口中方法的默认控制符是 public，并且不能定义为其他控制符
            抽象类中的方法控制符无限制，其中抽象方法不能使用 private 修饰
        区别6：方法实现不同
            接口中普通方法不能有具体的方法实现，在 JDK 8 之后 static 和 default 方法必须有方法实现
                static 或 default 方法如果没有方法实现就会报错，而普通方法如果有方法实现就会报错
            ​抽象类中普通方法可以有方法实现，抽象方法不能有方法实现
                抽象类中的普通方法如果没有方法实现就会报错，而抽象方法如果有方法实现则会报错。
        区别7：静态代码块使用不同
            接口中不能使用静态代码块
            抽象类中可以使用静态代码块

        抽象类是对事物的抽象
        接口是对行为的抽象

    */
}
