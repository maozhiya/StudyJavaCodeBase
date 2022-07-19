package Study.Day20;

/**
 * @author Li
 */
public class Demo {
    public static void main(String[] args) {
        Son s = new Son();
        System.out.println("----------");
        Son s1 = new Son(17);
        /*
        *   无论调用子类的有参构造还是无参构造，都会调用父类的无参构造
        *       这是因为：
                    子类中所有构造方法默认都会访问父类中无参构造方法
                    因为子类会继承父类中的数据，可能还会使用父类中的数据，所以子类初始化前，一定要先完成父类数据初始化
                    每一个子类构造方法的第一条语句默认都是：super()

            因此，每次在调用子类的时候，系统默认先执行了super()语句，先调用了父类的无参构造方法
            子类必须调用父类构造方法，不写则赠送super()；写了则用写的指定的super调用，super只能有一个，还必须是第一个。
        * */
    }
}
