package Study.Day08;

/**
 * @author Li
 */
public class Phone {
    /*
        成员变量：
            成员变量是定义在类中，方法体之外的变量。
            这种变量在创建对象的时候实例化。成员变量可以被类中方法、构造方法和特定类的语句块访问。
     */
        /**
         * 成员变量
         */
        String brand;
        int price;
    /*
    一个类可以拥有多个方法
     */

        /**
         * 成员方法
         */
        public void call() {
            System.out.println("打电话");
        }

        public void sentMessage() {
            System.out.println("发短信");
        }
}


