package Study.Day28;

/**
 * @author Li
 */
/*
    接口的主要用途就是被实现类实现，一个类可以实现一个或多个接口，
        继承使用 extends 关键字，
        实现则使用 implements 关键字。
    一个类可以实现多个接口，这也是 Java 为单继承灵活性不足所作的补充。

*/

public interface Jump{
    // String name;    // 不合法，变量name必须初始化

    /** public static final int age = 20; */
    int age = 18;

    /** 所有的抽象方法 (包括接口中的方法)必须用 javadoc 注释 */
    public abstract void jump();
    /* 接口没有构造方法，不能被实例化。 */
    // public Jump(){}
}
