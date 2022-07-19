package Study.Day19;

/**
 * @author Li
 */

/*
    总结：子类方法访问一个变量
        1.在子类的局部范围寻找
        2.在子类的成员范围寻找
        3.在父类的成员范围寻找。
 *
 */

public class Son extends Dad{
    public String name = "Li";
    public int time = 2018;
    public int day = 18;
    public void show() {
        int day = 20180101;
        System.out.println("age:" + age);
        System.out.println("name:" + name);
        System.out.println("time:" + time);
        System.out.println("day:" + day);
        /*
        *   关键字:
        *       this:
        *           访问成员变量: this.成员变量–访问本类成员变量
        *           访问构造方法: this(…) --访问本类构造方法
        *           访问成员方法: this.成员方法–访问本类成员方法
        *       super:
        *           访问成员变量: super.成员变量–访问父类成员变量
        *           访问构造方法: super(…) --访问父类构造方法
        *           访问成员方法: super.成员方法–访问父类成员方法
        * */
        System.out.println("this.day:" + this.day);
        System.out.println("super.day:" + super.day);
    }
}
