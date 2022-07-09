package Study.Day10;

/**
 * @author Li
 */
public class Student {
    /*
    * 构造方法:
    *   public class 类名{
    *       修饰符 类名(参数){
    *       }
    *   }
    * 功能: 主要是完成对象数据的初始化
    */

    private String name;
    private int age;

    /** 构造方法 */
    public Student() {
        System.out.println("无参构造方法");
    }
    /* 无参构造方法是默认构造方法
    *  如果有了构造方法, 系统将不再提供默认的构造方法
    *
    * 建议: 如果写了构造方法, 添加上无参构造方法
    * */

    public Student(String name) {
        this.name = name;
    }

    public Student(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}
