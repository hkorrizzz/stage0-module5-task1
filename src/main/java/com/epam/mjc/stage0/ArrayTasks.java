package com.epam.mjc.stage0;


public class ArrayTasks {


    public String[] seasonsArray() {
        return new String[]{"Winter", "Spring", "Summer", "Autumn"};
    }


    public int[] generateNumbers(int length) {
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }


    public int totalSum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }


    public int findIndexOfNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }


    public String[] reverseArray(String[] arr) {
        String[] reversed = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }


    public int[] getOnlyPositiveNumbers(int[] arr) {
        return java.util.Arrays.stream(arr).filter(x -> x > 0).toArray();
    }


}
