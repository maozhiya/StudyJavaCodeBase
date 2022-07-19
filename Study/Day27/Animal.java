package Study.Day27;

/**
 * @author Li
 */

/*
    Java 语言提供了两种类，分别为具体类和抽象类
        在面向对象的概念中，所有的对象都是通过类来描绘的
        但是反过来，并不是所有的类都是用来描绘对象的，如果一个类中没有包含足够的信息来描绘一个具体的对象，那么这样的类称为抽象类。

    抽象类的语法格式如下：
    <abstract>class<class_name> {
        <abstract><type><method_name>(parameter-list);
    }
    abstract 表示该类或该方法是抽象的
    class_name 表示抽象类的名称
    method_name 表示抽象方法名称
    parameter-list 表示方法参数列表

    需要注意的是 abstract 关键字只能用于普通方法，不能用于 static 方法或者构造方法中。

    抽象方法的 3 个特征如下：
        抽象方法没有方法体
        抽象方法必须存在于抽象类中
        子类重写父类时，必须重写父类所有的抽象方法

    注意：在使用 abstract 关键字修饰抽象方法时不能使用 private 修饰，因为抽象方法必须被子类重写，而如果使用了 private 声明，则子类是无法重写的。

    抽象类的定义和使用规则如下：
        抽象类和抽象方法都要使用 abstract 关键字声明。
        如果一个方法被声明为抽象的，那么这个类也必须声明为抽象的。而一个抽象类中，可以有 0~n 个抽象方法，以及 0~n 个具体方法。
        抽象类不能实例化，也就是不能使用 new 关键字创建对象。

    特点:
        抽象类中可以有常量，还可以有变量
        抽象类中可以有/没有抽象方法，也可以有非抽象方法
        有抽象方法一定是抽象类，是抽象类不一定有抽象方法
        抽象类不能直接实例化，但可以通过多态的方式实例化
        子类继承抽象方法时，必须重写父类中的所有抽象方法
        abstract修饰的抽象方法可以不在抽象类当中实现，但一定要在子类当中重写，并实现
        若子类不想重写抽象父类中的父类方法，则可以将子类也定义为抽象类
        抽象类可以有构造方法，目的是子类在初始化之前先初始化父类，即在new子类构造器()，之前先new父类构造器()

        抽象类不一定要有抽象方法，但是类中如果有抽象方法，那么这个类一定要是抽象类

        抽象类一定是个父类吗？ 是的，因为需要子类覆盖其方法后才可以对子类实例化。

    注意:
        final 不能和abstract同时使用，final修饰的方法禁止重写， abstract修饰的方法要求重写 ，冲突
        private修饰的方法时子类不可见的， abstract修饰的方法要求重写，冲突
        抽象方法不能使用static，static是针对类层次，抽象方法是针对对象层次的，所以不能一起使用


*/


    //  final 不能和abstract同时使用, final修饰的方法禁止重写， abstract修饰的方法要求重写 ，冲突

public abstract class Animal {

    //  private修饰的方法时子类不可见的， abstract修饰的方法要求重写，冲突
    // 抽象类中可以有常量，还可以有变量

    private int age = 18;
    private final String city = "宜宾";

    /** 抽象类中可以有/没有抽象方法，也可以有非抽象方法 */
    public abstract void eat();
    /** 抽象方法必须使用 javadoc 注释 */
    public abstract void method();

    public void sleep() {
        System.out.println("睡觉");
    }

    /** 抽象类可以有构造方法，目的是子类在初始化之前先初始化父类，即在new子类构造器()，之前先new父类构造器() */
    public Animal() {}

    public Animal(int age) {
        this.age = age;
    }

    public void show() {
        age = 19;
        System.out.println(age);
        // city = "四川";
        System.out.println(city);
    }
}
