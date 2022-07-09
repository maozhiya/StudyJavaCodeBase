package Study.Day09;

/**
 * @author Li
 */
public class Student {
    /*
    * 首次提封装:
    *   封装是一种将抽象性函式接口的实现细节部分包装、隐藏起来的方法
    *   封装可以被认为是一个保护屏障，防止该类的代码和数据被外部类定义的代码随机访问。
    *   要访问该类的代码和数据，必须通过严格的接口控制。
    *   封装最主要的功能在于我们能修改自己的实现代码，而不用修改那些调用我们代码的程序片段。
    *   适当的封装可以让程式码更容易理解与维护，也加强了程式码的安全性。
    *       封装的优点
                1. 良好的封装能够减少耦合。
                2. 类内部的结构可以自由修改。
                3. 可以对成员变量进行更精确的控制。
                4. 隐藏信息，实现细节。
    * */

    /*
    *   private关键字:
    *       作用是保护类中的成员变量或者成员方法的数据安全
    *       用于类中
    *       被private修饰过后的成员变量或成员方法都不能直接被外界调用, 需要先在类中进行数值的修饰才可以被外界调用
    * */

    /* 成员变量: 类中方法外
            在内存中的位置: 堆内存
            有默认的初始化
    */

    private String name;
    private int age;

    public void study() {
        /* 局部变量: 方法内或方法声明上
            在内存中的位置: 栈内存
            没有默认的初始化, 必须先定义, 赋值, 才能使用
        */
        int i = 0;
        System.out.println("好好学习");
    }
    public void show() {
        System.out.println(getName() + "," + getAge());
    }
    // 快捷键: alt + insert    生成构造函数
    /** 1.public 返回值类型 get变量名()
     *      用于获取在类中被private修饰后的变量 该操作有返回值
     * 2.public set变量名(参数)
     *      用于设置在类中被private修饰后的变量的方法
     * */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    /*
        成员变量跟一个方法里面的局部变量名字是一样的！
        this.name=name 的意思也就相当于 Student.name

        必须先了解清楚面向对象
        如果没那个耐心，你还是放弃 java 吧
    * */
    /*
        this 关键字:
        this 可以实现以下三类结构的描述：
            1. 当前类中的属性：this.属性
            2. 当前类中的方法（普通方法、构造方法）: this()、this.方法名称()
            3. 描述当前对象

            this 可以算是 Java 里面比较复杂的关键字
            this 的使用形式上决定了它的灵活性

            什么时候使用 this: 解决局部变量隐藏成员变量
    * */
}
