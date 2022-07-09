package Study;

import java.util.Arrays;

/**
 * @author Li
 */
public class Day04 {
    public static void main(String[] args) {
        // 一: 数组
        System.out.println("一: 数组");
        // 1. 数组的定义格式
        /*
         * 1.1
         * 数据类型[] 变量名
         * int[] arr
         * 定义了一个 int 类型的数组, 数组名是 arr
         */
        /*
         * 1.2
         * 数据类型 变量名[]
         * int arr[]
         * 定义了一个 int 类型的变量, 变量名是 arr 数组
         */
        // 2. 数组初始化方式
        /*
         * 2.1 动态初始化: 初始化时只指定数组长度, 由系统为数组分配初值
         * 格式: 数据类型[] 变量名 = new 数据类型[数组长度]
         */

        int[] arr = new int[3];
        // 3. 数组元素的访问
        // 3.1 输出数组名 [I@140e19d
        System.out.println(arr);
        // 3.2 输出数组中的元素 数组在初始化时,会为存储空间添加默认值
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // 4. 内存分配: Java 程序在运行时, 需要在内存中分配空间.
        // 4.1 栈内存: 存储局部变量
        // 4.2 堆内存: 存储 new 出来的内容(实体, 对象)

        // 5. 数组操作的常见小问题
        // 5.1 索引越界
        /* System.out.println(arr[3]); ArrayIndexOutOfBoundsException: 3 */
        // 5.2 空指针异常
        int[] arr2 = new int[3];
        arr2 = null;
        // System.out.println(arr2[0]);   ---->  NullPointerException

        // 6. 遍历
        // 6.1 获取数组元素的数量
        System.out.println("传统方法for:");
        int[] arr3 = { 11, 22, 33, 44, 55 };
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("非传统方法for-each:");
        for(int i : arr3) {
            System.out.println(i);
        }
        System.out.println("利用Arrays类中的toString()方法:");
        System.out.println(Arrays.toString(arr3));

        // 6.2 length
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr[i]);
        }

        // 7. 获取最值
    }
}
