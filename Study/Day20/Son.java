package Study.Day20;

/**
 * @author Li
 */
public class Son extends Dad{
    public Son() {
        // super();
        System.out.println("Son 中无参构造方法被调用");
    }

    public Son(int age) {
        // super();
        System.out.println("Son 中带参构造方法被调用");
    }
}
