package Study.Day32;

/**
 * @author Li
 */
public class MethodInner {
    /* 方法内部类 */

    /*
    定义在方法内部：类比局部变量
        a.对外部完全隐藏，因此方法内部类不能有任何访问修饰符
        b.方法内部类没有访问形参是，这个形参是可以在方法中随意修改的，一旦方法内部类中使用了形参，这个形参必须被声明为final。
    */

    private int time = 2018;

    /** 局部内部类 */
    public void method() {
        class MyInner {
            public void show() {
                System.out.println("MyInner show time :" + time);
            }
        }

        MyInner mi = new MyInner();
        mi.show();
    }
}
