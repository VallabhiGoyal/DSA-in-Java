package Sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        insertionSort(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }

        sc.close();
    }

    public static void insertionSort(int[] arr){
        int n = arr.length;

        for(int i = 1; i<n; i++){
            int key = arr[i];
            int j = i - 1;
            while(j>=0 && key<arr[j]){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
