package Study.Day27;

/**
 * @author Li
 */

/* 若子类不想重写抽象父类中的父类方法，则可以将子类也定义为抽象类 */

public abstract class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

}
