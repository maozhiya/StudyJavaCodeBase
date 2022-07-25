package Study.Day33;

/**
 * @author Li
 */

/*
    Class System
        java.lang.Object
            java.lang.System

    System类包含几个有用的类字段和方法。 它不能被实例化。


*/

public class SystemDemo {
    public static void main(String[] args) {
        /* static long currentTimeMillis​() 返回当前时间（以毫秒为单位）。
        *       以纳秒为单位返回正在运行的Java虚拟机的高分辨率时间源的当前值。
        *       返回当前时间（以毫秒为单位）。 请注意，虽然返回值的时间单位为毫秒，但该值的粒度取决于底层操作系统，并且可能较大。 例如，许多操作系统以几十毫秒为单位测量时间。
        *       在1970年1月1日UTC之间的当前时间和午夜之间的差异，以毫秒为单位。
         * */
        System.out.println("System.currentTimeMillis():" + System.currentTimeMillis());
        System.out.println(System.currentTimeMillis() * 1.0 / 1000 / 60 / 60 / 24 / 365);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            System.out.print(i + ",");
        }
        System.out.println("");
        long end = System.currentTimeMillis();
        System.out.println("for 耗时:" + (end - start));

        /* static void exit​(int status) 终止当前运行的Java虚拟机。  */
        System.out.println("开始");
        System.exit(0);
        System.out.println("结束");
    }

}
