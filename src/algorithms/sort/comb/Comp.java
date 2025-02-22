package sort.comb;

import java.util.Arrays;

public class Comp {
    public static void main(String[] args) {
        System.out.println("algorithm bubble sort ");
        int[] arr = new int[]{5, 2, 1, 3, 4, 8, 7, 4};
        System.out.println("before sorting is " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("after sorting is " + Arrays.toString(arr));

    }

    private static int[] bubbleSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length - i); j++) {
                if (arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
