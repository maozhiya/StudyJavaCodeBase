package Study.Day34;

import java.util.Scanner;

/**
 * @author Li
 */
public class BubbleSort {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("input array.length:");
//        int n = sc.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i < n - 1; i++) {
//            System.out.println("input array num:");
//            array[i] = sc.nextInt();
//        }

        int[] arr = {1, 5, 4, 2, 3};
        ArrayBefore(arr);
        BubbleSort(arr);
    }

    public static void ArrayBefore(int[] arr) {
        System.out.print("before:");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    public static void BubbleSort(int[] arr) {
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("after:");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
