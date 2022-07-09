package Study.Day20;

/**
 * @author Li
 */
public class Day21Dad {
    public static void main(String[] args) {
        Study.Day20.Dad d = new Study.Day20.Dad();
        d.show();
        d.show1();
        d.show2();
        d.show3();
    }
    private void show() {
        System.out.println("private");
    }

    void show1() {
        System.out.println("默认");
    }

    protected void show2() {
        System.out.println("protected");
    }

    public void show3() {
        System.out.println("public");
    }
}
