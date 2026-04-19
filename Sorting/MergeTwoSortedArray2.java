package Sorting;

import java.util.Scanner;
import java.util.Arrays;

public class MergeTwoSortedArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of array1");
        int n = sc.nextInt();

        System.out.println("Enter the elements of array1");
        int[] arr1 = new int[n];
        for(int i = 0; i<n; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the number of elements of array1");
        int m = sc.nextInt();

        System.out.println("Enter the elements of array1");
        int[] arr2 = new int[m];
        for(int i = 0; i<m; i++){
            arr2[i] = sc.nextInt();
        }

        sort(arr1, arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        sc.close();
    }
    public static void sort(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;

        int gap = (n+m+1)/2;
        
        while(gap > 0){
            int i = 0;
            int j = gap;
            while(j < n + m){
                if( i < n && j < n){
                    if(arr1[i] > arr1[j]) swap(arr1, i, arr1, j);
                }    
                else if(i<n && j>=n){
                    if(arr1[i] > arr2[j-n]) swap(arr1, i, arr2, j-n);
                }
                else{
                    if(arr2[i-n] > arr2[j-n]) swap(arr2, i-n, arr2, j-n);
                }
                i++;
                j++;
            }
            if(gap == 1) gap = 0;
            else gap = (gap+1)/2;
        }
    }

    public static void swap(int[] arr1, int i, int[] arr2, int j){
        int temp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;
    }
}
