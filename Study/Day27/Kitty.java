package Study.Day27;

/**
 * @author Li
 */
public class Kitty extends Cat{

    /* abstract修饰的抽象方法可以不在抽象类当中实现，但一定要在子类当中重写，并实现 */

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void method() {
        System.out.println("我是Hello Kitty");
    }

    public void playGame() {
        System.out.println("kitty捉迷藏");
    }
}
