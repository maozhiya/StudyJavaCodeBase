package Study.Day21;

/**
 * @author Li
 */
public class Dad {
    public void show() {
        System.out.println("Dad 中的 show 方法被调用");
    }

    private void show1() {
        System.out.println("Dad 中的 show1 方法被调用(private)");
    }

    void show2() {
        System.out.println("Dad 中的 show2 方法被调用(默认修饰符)");
    }

    public void show3() {
        System.out.println("Dad 中的 show3 方法被调用(public)");
    }
}
