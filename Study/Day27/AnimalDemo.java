package Study.Day27;

/**
 * @author Li
 */
public abstract class AnimalDemo {
    public static void main(String[] args) {
        // Animal a = new Animal();     抽象方法只有声明没有实现

        /* Animal a = new Cat(); */
        /* 抽象类不能直接实例化，但可以通过多态的方式实例化 */

        Animal d = new Dog();
        d.eat();
        d.sleep();
        Animal k = new Kitty();
        k.eat();
        k.sleep();
        k.method();
        // k.playGame;

        d.show();
    }
}
