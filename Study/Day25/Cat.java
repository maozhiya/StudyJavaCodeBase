package Study.Day25;

/**
 * @author Li
 */
public class Cat extends Animal{
    public int age = 18;
    public int time = 2018;

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void playGame() {
        System.out.println("猫捉迷藏");
    }
}
