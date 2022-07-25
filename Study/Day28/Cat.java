package Study.Day28;

/**
 * @author Li
 */

/* Java 接口的定义方式与类基本相同，不过接口定义使用的关键字是 interface */

public class Cat implements Jump, JumpMom{
    /* 当类实现接口的时候，类要实现接口中所有的方法。否则，类必须声明为抽象的类。 */

    @Override
    public void jump() {
        System.out.println("猫可以跳高了");
    }
}
