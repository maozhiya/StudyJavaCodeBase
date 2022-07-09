package Study.Day18;

/**
 * @author Li
 */
public class Demo {
    public static void main(String[] args) {
        // 创建对象, 调用方法
        Father f = new Father();
        f.show();

        Son s = new Son();
        s.method();
        s.show();
    }
}
