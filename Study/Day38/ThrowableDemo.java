package Study.Day38;

/**
 * @author Li
 */
public class ThrowableDemo {
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
            // e.printStackTrace();

//            public String getMessage() {
//                return detailMessage;
//            }
            System.out.println("e.getMessage():" + e.getMessage());
            System.out.println("e.toString():" + e.toString());
            e.printStackTrace();
        }
        return 0;
    }
}
