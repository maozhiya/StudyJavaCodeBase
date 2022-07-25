package Study.Day29;

/**
 * @author Li
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        Inter i = new InterImplements();
        // Inter.num = 20;
        System.out.println("Inter.num:" + Inter.num);
        // Inter.num2 = 40;
        System.out.println("Inter.num2:" + Inter.num2);
        // Inter.num3 = 20;
        System.out.println("Inter.num3:" + Inter.num3);
        i.show();
    }
}
