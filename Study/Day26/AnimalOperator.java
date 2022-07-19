package Study.Day26;

/**
 * @author Li
 */
public class AnimalOperator {

//    public void useAnimal(Cat c) { //Cat c = new Cat();
//        c.eat();
//    }
//
//    public void useAnimal(Dog d) { //Dog d = new Dog();
//        d.eat();
//    }

    public void useAnimal(Animal a) {
        // Animal a = new Cat();
        // Animal a = new Dog();

        a.eat();
        /*
            多态的弊端：
                不能使用子类的特有功能
        */
        // a.lookDoor();

    }
}
