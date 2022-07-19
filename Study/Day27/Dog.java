package Study.Day27;

/**
 * @author Li
 */
public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void method() {
        System.out.println("Dog lookDoor");
    }
}
