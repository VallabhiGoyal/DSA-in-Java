package Arrays;

import java.util.Scanner;

public class CheckSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Is the array sorted: " + checkSorted(arr));
        sc.close();
    }

    private static boolean checkSorted(int[] arr){
        int n = arr.length;
        for(int i =0; i<n-1; i++){
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }
}
