package lesson2;

import jdk.nashorn.internal.runtime.arrays.ArrayData;

public class NewArr {

    public void newArrExp(int arr[][]) {
        int x = arr.length;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (arr[i][j] == arr[x][x]) {
                    throw new ArrayIndexOutOfBoundsException("Array is not correct");
                }
            }
        }
    }

    public void arrFill(int arr[][]) {
        int x = arr.length;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                //     System.out.print(arr[i][j] + " ");
            }
            // System.out.println();
        }
    }

    public int summArr(int arr[][]) {
        int x = arr.length;
        int summ = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                summ += arr[i][j];
            }
        }
        System.out.println("array summ is: " + summ);
        return summ;
    }

    public void arrExpNew(int arr[][]) {
        int x = arr.length;
        String a = "ff";
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (arr[i][j] == arr[Integer.parseInt(a)][j]) {
                    throw new NumberFormatException("Array is not correct");
                }
            }
        }
    }

    public static void main(String[] args) {

        // int[][] arr = new int[4][4];
        int[][] arr = {{0, 1, 2, 3}, {0, 1, 2, 3}, {0, 1, 2, 3}, {0, 1, 2, 3}};
        NewArr arr1 = new NewArr();
        try {
            arr1.newArrExp(arr);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catch the block");
            e.printStackTrace();
        }
        arr1.arrFill(arr);
        arr1.summArr(arr);
        try {
            arr1.arrExpNew(arr);
        } catch (NumberFormatException e) {
            System.out.println("Catch the second block");
            e.printStackTrace();
        }
    }
}







