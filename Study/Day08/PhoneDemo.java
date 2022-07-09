package Study.Day08;

/**
 * @author Li
 */
public class PhoneDemo {
    public static void main(String[] args) {
        /* 对象：对象是类的一个实例 */
        // 创建对象
        Phone p = new Phone();
        // 使用成员变量
        System.out.println(p.brand);
        System.out.println(p.price);
        p.brand = "华为";
        p.price = 3999;
        System.out.println(p.brand);
        System.out.println(p.price);
        // 使用成员方法
        p.call();
        p.sentMessage();
        System.out.println("多个对象和多个对象指向相同");
        //  ox --> 001
        System.out.println("--- p1 ---");
        Phone p1 = new Phone();
        p1.brand = "p1";
        p1.price = 1;
        System.out.println(p1.brand);
        System.out.println(p1.price);
        //  ox --> 002
        System.out.println("--- p2 ---");
        Phone p2 = new Phone();
        p2.brand = "p2";
        p2.price = 2;
        System.out.println(p2.brand);
        System.out.println(p2.price);
        //  ox --> 002
        System.out.println("--- p3 ---");
        Phone p3 = p2;
        System.out.println(p3.brand);
        System.out.println(p3.price);

    }
}
