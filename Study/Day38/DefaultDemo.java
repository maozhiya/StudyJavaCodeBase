package Study.Day38;

/**
 * @author Li
 */
public class DefaultDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println("star");
        method(arr);
        System.out.println("end");
    }

    public static int method(int[] arr) {
        return arr[arr.length];
    }
    /*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
        at Study.Day38.DefaultDemo.method(DefaultDemo.java:13)
        at Study.Day38.DefaultDemo.main(DefaultDemo.java:9)*/
}
