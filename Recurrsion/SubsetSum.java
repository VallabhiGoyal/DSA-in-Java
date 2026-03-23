package Recurrsion;

import java.util.Scanner;

public class SubsetSum {
    public static boolean[][] t;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elemenets");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the array");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target sum");
        int sum = sc.nextInt();

        System.out.println(isSubsetSum(arr, sum));
        sc.close();
    }
    public static Boolean isSubsetSum(int arr[], int sum) {
        int n = arr.length;
        
        t = new boolean[n+1][sum+1];
        
        for(int i = 0; i <= n; i++){
            t[i][0] = true;
        }

        for(int j = 1; j <= sum; j++){
            t[0][j] = false;
        }
        
        for(int i = 1;i<n+1; i++){
            for(int j = 1; j<sum+1; j++){
                if(arr[i-1] <= j){
                    t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        
        return t[n][sum];
    }
}
