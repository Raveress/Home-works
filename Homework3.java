package HomeWorkLesson3;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
        replaceNumbers();
        fillArray();
        multiplyByTwo();
        fillInTheDiagonals();
        argumentsToArray(5, 8);
        minAndMax();
        sumLeftAndRight();
        shiftToRight();



    }

    private static void replaceNumbers() {
        int[] arr = {1,0,1,1,0,1,1,0,0};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }


    private static void multiplyByTwo() {
        int[] arr = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void fillInTheDiagonals() {
        int size = 5;
        int[][] square = new int[size][size];
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                if(i == j || i + j == size - 1 ){
                    square[i][j] = 1;
                }
                System.out.printf("%2d ", square[i][j]);

            }
            System.out.println();
        }
    }

    private static void argumentsToArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            if(i >= 0){
                arr[i] = initialValue;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void minAndMax() {
        int[] arr = {5,4,8,10,2,7,9};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i != arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }else if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Минимальный элемент: " + min + " " + "Максимальный элемент: " + max);
    }

    private static boolean sumLeftAndRight() {
        int[] checkSum = {6,5,4,8,2,5};
        int left = 0;
        int right = 0;
        for (int i = 0; i < checkSum.length; i++) {
            left += checkSum[i];
            for (int j = 0; j < checkSum.length; j++) {
                right += (j > i)? checkSum[j]: 0;
            }
            if(left == right){
                return true;
            }
        }
        return false;

    }

    private static void shiftToRight() {
        int[] arr = {1,2,3,4,5,6,7};
        int n = 3;
        System.out.print("Исходный: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        if(n > 0){
            for (int i = 0; i < n; i++) {
                int temp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0 ; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = temp;
            }
        }
        System.out.print("Сдвиг:  ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }





}

    
        