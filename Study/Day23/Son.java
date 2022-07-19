package Study.Day23;

/**
 * @author Li
 */
public class Son extends Dad{

//    /*
//    @Override
//    private void showOne() {
//        System.out.println("Son private");
//    }
//    */

    @Override
    protected void showTwo() {
        System.out.println("Son protected");
    }

    @Override
    void showThree() {
        System.out.println("Son 默认修饰符");
    }

    @Override
    public void showFour() {
        System.out.println("Son public");
    }

    public static void main(String[] args) {
        Son s = new Son();
        /* s.showOne; */
        s.showTwo();
        s.showThree();
        s.showFour();
    }
}
