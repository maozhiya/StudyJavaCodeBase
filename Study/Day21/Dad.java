package Study.Day21;

/**
 * @author Li
 */
public class Dad {
    public static void main(String[] args) {
        Dad d = new Dad();
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
