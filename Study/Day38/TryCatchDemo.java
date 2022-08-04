package Study.Day38;

/**
 * @author Li
 */

/*
    try {
        可能出现异常的代码;
    } catch(异常类名 变量名) {
        异常的处理代码;
    }
*/

public class TryCatchDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println("star");
        method(arr);
        System.out.println("end");
    }

    public static int method(int[] arr) {

        try {
            return arr[arr.length];
        } catch (ArrayIndexOutOfBoundsException e) {
            /** System.out.println("NULL"); */
            e.printStackTrace();
        }
        return 0;
    }
}
