package Study.Day33;

/**
 * @author Li
 */

/*
    java.lang.Object
        java.lang.Math

    MathAPI:
    public final class Math
    extends Object
    Math包含执行基本数字运算的方法，如基本指数，对数，平方根和三角函数。

    static double E double价值比其他任何一个更接近 e ，自然对数的基础。
    static double PI 比其他任何一个更接近 pi的 double值，圆周长与其直径的比率。

*/

public class MathDemo {
    public static void main(String[] args) {
        /*
        static double abs​(double a) 返回值为 double绝对值。
        static float abs​(float a) 返回值为 float绝对值。
        static int abs​(int a) 返回一个 int绝对值。
        static long abs​(long a) 返回值为 long绝对值。
        */
        System.out.println("Math.abs(10):" + Math.abs(10));
        System.out.println("Math.abs(-10):" + Math.abs(-10));

        /* static double ceil​(double a) 返回最小的（最接近负无穷大） double值，该值大于或等于该参数，并等于某个整数。   */
        System.out.println("Math.ceil(1.1):" + Math.ceil(1.1));
        System.out.println("Math.ceil(1.9):" + Math.ceil(1.9));

        /* static double floor​(double a) 返回小于或等于参数的最大（最接近正无穷大） double值，等于数学整数。  */
        System.out.println("Math.floor(2.2):" + Math.floor(2.2));
        System.out.println("Math.floor(2.9):" + Math.floor(2.9));

        /* static long round​(double a) 返回最接近 long的参数，其中 long四舍五入为正无穷大。  */
        System.out.println("Math.round(12.2):" + Math.round(12.2));
        System.out.println("Math.round(12.6):" + Math.round(12.6));

        /* static int max​(int a, int b) 返回两个 int中的较大值。  */
        System.out.println("Math.max(1, 2):" + Math.max(1, 2));
        System.out.println("Math.max(6, 2):" + Math.max(6, 2));

        /* static int min​(int a, int b) 返回两个 int中的较小值。 */
        System.out.println("Math.min(1, 2):" + Math.min(1, 2));
        System.out.println("Math.min(6, 2):" + Math.min(6, 2));

        /* static double pow​(double a, double b) 将第一个参数的值返回到第二个参数的幂。 */
        System.out.println("Math.pow(3,2):" + Math.pow(3,2));
        System.out.println("Math.pow(2,3):" + Math.pow(2,3));

        /* static double random​() 返回值为 double的正值，大于等于 0.0 ，小于 1.0 。 */
        System.out.println("Math.random():" + Math.random());
        System.out.println("Math.random():" + Math.random());
    }
}
