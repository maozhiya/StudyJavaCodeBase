package Study.Day32;

/**
 * @author Li
 */

/* 定义在外部类的内部，使用static修饰，类比静态方法，静态内部类不需要外部类对象产生就能使用，不能访问外部类的成员域，但能访问静态域 */

public class StaticInner {
    static int age;
    String name;

    /*
    静态内部类的创建语法：
        1.外部类内部：与成员内部类一样
        2.外部类外部：StaticInnerClass.Inner inner = new StaticInnerClass.Inner();
    */

    static class Inner {
        protected void test() {
            System.out.println("test age:" + age);
            // System.out.println("test name:" + name);
        }
    }

}
