package StudyJava;

/**
 * @author Li
 */
public class Day06 {
    public static void main(String[] args) {
        // 一: 方法重载
        System.out.println("一: 方法重载");
        // 1. 方法重载(方法重载是一个类的多态性表现)
        // 1.1同一个类中定义的多个方法之间的关系, 满足下列条件的多个方法互相构成重载
        // 1.1.1 多个方法再同一个类中
        // 1.1.2 多个方法具有相同的方法名
        // 1.1.3 多个方法的参数不相同, 类型或者数量不同
        // 2.2 方法重载的特点
        // 2.2.1 重载仅对应方法的定义,与方法的调用无关,调用方式参照标准格式
        // 2.2.2 重载仅针对同一个类中方法的名称与参数进行识别,与返回值无关,换句话说不能通过返回值来判定两个方法是否相互构成重载
        int result = sum(10, 20);
        System.out.println("a + b" + result);
        double result2 = sum(10.0, 20.0);
        System.out.println("a + b" + result2);
        int result3 = sum(10, 20, 30);
        System.out.println("a + b + c" + result3);

        // 二: 方法的参数传递
        System.out.println("二: 方法的参数传递");
        // 1. 基本类型
        int num = 100;
        System.out.println("调用 change 方法前:" + num);
        change(num);
        System.out.println("调用 change 方法后:" + num);
        // 2. 引用类型
        int[] arr = {1, 3, 5, 7};
        System.out.println("调用 changeNum 方法前:" + arr[1]);
        changeNum(arr);
        System.out.println("调用 changeNum 方法后:" + arr[1]);
    }
    /** 两个 int 类型数据和的方法 */
    public static int sum(int a, int b){
        return a + b;
    }
    /** 两个 double 类型数据和的方法 */
    public static double sum(double a, double b){
        return a + b;
    }
    /** 三个 int 类型数据和的方法 */
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
    /** 方法参数传递(基本类型) */
    public static void change(int number){
        number = 200;
    }
    /** 方法参数传递(引用类型) */
    public static void changeNum(int[] arr){
        arr[1] = 30;
    }
}
