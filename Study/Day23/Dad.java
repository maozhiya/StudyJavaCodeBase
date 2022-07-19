package Study.Day23;

/**
 * @author Li
 */
public class Dad {
    private void showOne() {
        System.out.println("Dad private");
    }

    protected void showTwo() {
        System.out.println("Dad protected");
    }

    void showThree() {
        System.out.println("Dad 默认修饰符");
    }

    public void showFour() {
        System.out.println("Dad public");
    }

    public static void main(String[] args) {
        Dad d = new Dad();
        d.showOne();
        d.showTwo();
        d.showThree();
        d.showFour();
    }
}
