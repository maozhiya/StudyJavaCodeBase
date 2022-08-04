package Study.Day35;

/**
 * @author Li
 */
public class IntToString {
    public static void main(String[] args) {
        /* int ---> String */
        // First method
        int num = 100;
        String s = "" + num;
        System.out.println("s:" + s);

        // Second method

//        public static String valueOf(int i) {
//        return Integer.toString(i);
//        }

        String s1 = String.valueOf(num);
        System.out.println("s1:" + s1);

        /* String ---> int */
        // First method (String -> Integer -> int)
        Integer i = Integer.valueOf(s);
        /*intValue() 作为一个 int返回该 Integer价值。 */
        int i1 = i.intValue();
        System.out.println("i1:" + i1);
        // Second method

//        public static int parseInt(String s) throws NumberFormatException {
//            return parseInt(s,10);
//        }

        int i2 = Integer.parseInt(s);
        System.out.println("i2:" + i2);

    }
}
