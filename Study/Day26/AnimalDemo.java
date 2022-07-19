package Study.Day26;

/**
 * @author Li
 */

/*
    向上转型
        从子到父
        父类引用指向子类对象

    向下转型
        从父到子
        父类引用转为子类对象
 */

public class AnimalDemo {
    public static void main(String[] args) {
        //创建动物操作类的对象，调用方法
        AnimalOperator ao = new AnimalOperator();
        Cat c = new Cat();
        ao.useAnimal(c);

        Dog d = new Dog();
        ao.useAnimal(d);

        Pig p = new Pig();
        ao.useAnimal(p);

        // 对象的向上转型：父类 父类对象 = 子类实例
        Animal aCat = new Cat();
        System.out.print("aCat:");
        aCat.eat();
        /*
         运用向上转型后，此时若想访问子类中特有的方法是不可以的，
         所以就有了向下转型。
         通过对象的向上转型可以实现接受参数的统一，向下转型可以实现子类扩充的调用（一般不操作向下转型，有安全隐患）
         */
        // 对象的向下转型：子类 子类对象 = （子类）父类实例
        Cat cAnimal = (Cat)aCat;
        System.out.print("cAnimal.eat:");
        cAnimal.eat();
        System.out.print("cAnimal.playGame:");
        cAnimal.playGame();

        System.out.println("----------");
        /*
        //  向下转型之前一定要进行向上转型
        否则
            Exception in thread "main" java.lang.ClassCastException: Study.Day26.Animal cannot be cast to Study.Day26.Dog
        */
        Animal aDog = new Dog();
        System.out.print("aDog.eat:");
        aDog.eat();

        /* aCat.lookDoor(); */

        Dog dAnimal = (Dog)aDog;
        System.out.print("dAnimal.eat():");
        dAnimal.eat();
        System.out.print("dAnimal.lookDoor():");
        dAnimal.lookDoor();
        System.out.println("----------");
        aDog = new Pig();
        // 两个没有关系的类对象是不能够转型的，一定会产生ClassCastException
        // Dog ddAnimal = (Dog)aDog;    ClassCastException
        System.out.print("aDog = new Pig:");
        aDog.eat();
        // aDog.lookDoor();

        // 一般不操作向下转型，有安全隐患

        /**  instanceof
            严格来说 instanceof 是 Java 中的一个双目运算符，由于它是由字母组成的，所以也是 Java 的保留关键字。

            boolean result = obj instanceof Class
            obj 是一个对象, Class 表示一个类或接口
            obj 是 class 类（或接口）的实例或者子类实例时，结果 result 返回 true，否则返回 false
            obj 必须为引用类型，不能是基本类型
         */

        /* 1）声明一个 class 类的对象，判断 obj 是否为 class 类的实例对象（很普遍的一种用法） */
        Integer integer = new Integer(1);
        System.out.println("integer instanceof  Integer:" + (integer instanceof Integer));

        /* 2）obj 是 class 类的直接或间接子类 */

        Animal cObj = new Animal();
        Animal cObj1 = new Cat();
        Cat acObj = new Cat();

        System.out.println("cObj instanceof Cat:" + (cObj instanceof Cat));
        System.out.println("dObj instanceof Cat:" + (cObj1 instanceof Cat));
        System.out.println("acObj instanceof Cat:" + (acObj instanceof Cat));


    }
}
