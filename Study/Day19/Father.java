package Study.Day19;

/**
 * @author Li
 */
public class Father {
    public int age = 40;

    public Father() {
        System.out.println("Fu 中无参构造方法被调用");
    }
    public Father(int age) {
        System.out.println("Fu 中带参构造方法被调用");
    }
    public void MethodOverride() {
        System.out.println("Fu MethodOver");
    }
}
