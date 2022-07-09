package Study.Day19;

/**
 * @author Li
 */
public class Demo {
    public static void main(String[] args) {
        /*
            在子类方法中访问特点:
                子类局部范围找
                子类成员范围找
                父类成员范围找
                如果没有就报错
        * */

        Son s = new Son();
        s.show();
        System.out.println("------------");
        s.method();

        /*
         *   继承构造方法的访问特点
         *       1、子类构造方法中有一个默认隐含的super()调用,所以一定是先调用的父类构造,后执行的子类构造
         *       2、子类构造可以通过super关键字来调用父类重载构造
         *       3、super的父类构造调用,必须是子类构造方法的第一个语句,不能一个子类构造调用多次super构造
         *       4、子类必须调用父类构造方法,不写则默认隐式赠送一个super();写了则用写的指定的super调用,super只能有一个,还必须是第一个
         * */

        // 访问子类成员
        s.showOne();
        // 访问父类成员
        s.showTwo();
        System.out.println("---------");
        Son s1 = new Son();
        System.out.println("---------");
        Son s2 = new Son(17);

        /*
         *   方法重载:
         *       重写(override): 也称覆盖。重写是子类对父类非静态, 非private，非final方法的实现过程进行重新编写，返回值（JDK7以后，被重写的方法返回值类型可以不同，但是必须是具有父子关系的）和形参都不能改变。即外壳不变，核心重写。
         *           子类在重写父类的方法时，一般必须与父类方法原型一致：修饰符 返回值类型 方法名(参数列表) 要完全一致
         *           JDK7以后，被重写的方法返回值类型可以不同，但是必须是具有父子关系的
         *           访问权限不能比父类中被重写的方法的访问权限更低
         *           父类被static、private final修饰的方法不能被重写
         *           子类方法访问权限不能更低( public > 默认 > private)
         *           方法重写是子类与父类的一种多态性表现
         *
         *       注意事项:
         *           重写都是方法的重写，和属性无关
         *           需要有继承关系，子类重写父类的方法
         *           子类的方法和父类必须一致;方法体不同
         *
         * */

        System.out.println("MethodOver:");
        s.MethodOverride();

    }
}
