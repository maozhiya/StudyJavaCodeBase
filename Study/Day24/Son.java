package Study.Day24;

/**
 * @author Li
 */
public class Son extends Dad{
    public final String dress = "Sichuan";
    public final int age = 18;
    String name = "You";
    String time = "2017";

    /*
    static:
        被类的所有对象共享
    */

    public static String university = "Home";
    public static int old;

//    /*
//    final 修饰成员方法，则这个方法不可被重写，重载，
//    @Override
//    public void method() {
//        System.out.println("Son method");
//    }
//    */

    public void universityShow() {
        System.out.println(university);
    }

    public void show() {
        // age = 19;
        // dress = "China";
        // final 基本数据类型的变量：final修饰指的是基本数据的数据值不能发生改变
        final String name = "Li";
        // name = "Mao";
        System.out.println("age:" + age);
        System.out.println("dress:" + dress);
        System.out.println("super.dress:" + super.dress);
        System.out.println("name:" + name);
        System.out.println("this.name:" + this.name);
        System.out.println("super.name:" + super.name);
    }

    /*
        *   非静态的成员方法
                .能访问静态的成员变量
                .能访问非静态的成员变量
                .能访问静态的成员方法
                .能访问非静态的成员方法
*           静态的成员方法
                .能访问静态的成员变量
                .能访问静态的成员方法
*       静态成员方法只能访问静态成员
    * */

    public void staticOne() {
        /* 非静态的成员方法 */
    }

    public void staticTwo() {
        /* 非静态的成员方法 */
        System.out.println(name);
        System.out.println(university);
        System.out.println(old);
        staticOne();
        staticThree();
        staticFour();
    }

    public static void staticThree() {
        /* 静态的成员方法 */
    }

    public static void staticFour() {
        /* 静态的成员方法 */
        /* System.out.println(name); */
        System.out.println(university);
        System.out.println(old);
        /*
            staticOne();
            staticTwo();
        */

        staticThree();
    }
}
