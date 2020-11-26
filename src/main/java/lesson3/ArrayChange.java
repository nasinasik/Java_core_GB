package lesson3;

import java.util.Arrays;


public class ArrayChange {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 10, 15};
        int l = arr[1];
        int r = arr[3];
        System.out.println("old order:" + l + " " + r);
        change(arr, arr[1], arr[3]);
        System.out.println("new order:" + arr[1] + " " + arr[3]);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] change(int[] arr, int l, int r) {
        l = arr[1];
        r = arr[3];
        arr[3] = l;
        arr[1] = r;
        return arr;
    }
}