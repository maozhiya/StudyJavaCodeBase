package Study.Day34;

import java.util.Arrays;

/**
 * @author Li
 */
public class ArrayDemo {
    public static void main(String[] args) {
        /* array API */

        int[] arr = {1, 3, 5, 7, 9, 8, 6, 4, 2};

        /* public static String toString(double[] a)
        返回指定数组的内容的字符串表示形式。的字符串表示形式由一列数组中的元素，在方括号内（ "[]"）。相邻的元素是由人物 ", "隔开（逗号后面加一个空格）。元素转换为字符串的 String.valueOf(double)。返回 "null"如果 a是 null。*/

        /* public static String toString(int[] a)
         返回指定数组的内容的字符串表示形式。的字符串表示形式由一列数组中的元素，在方括号内（ "[]"）。相邻的元素是由人物 ", "隔开（逗号后面加一个空格）。元素转换为字符串的 String.valueOf(int)。返回 "null"如果 a是 null。 */
        System.out.print("before:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("");

        System.out.println("toString after:" + Arrays.toString(arr));

        /* sort(int[] a)
        将指定的数组排序为上升的数值顺序。 */
        System.out.print("sort after:");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /*
        工具类的设计思想:
            构造方法用 private
            成员用    public static
    */

}
