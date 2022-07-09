package Study.Day19;

/**
 * @author Li
 */
public class Son extends Father {
    public String name = "Li";
    public int age = 20;

    public void show() {
        System.out.println(name + "," + age);
    }
    public void method() {
        int age = 17;
        System.out.println(name + "," + age);
    }
    public void showOne() {
        // 访问子类成员
        System.out.println("this.age:" + this.age);
    }
    public void showTwo(){
        // 访问父类成员
        System.out.println("super.age:" + super.age);
    }

    public Son() {
        System.out.println("Son 中无参构造方法被调用");
    }
    public Son(int age) {
        System.out.println("Son 中带参构造方法被调用");
    }

    /*public Zi (int age) {
        super();
        super(17);
        System.out.println("Zi 中带参构造方法被调用");
    }
*/

    @Override
    public void MethodOverride() {
        super.MethodOverride();
        System.out.println("Son MethodOverride");
    }
}
