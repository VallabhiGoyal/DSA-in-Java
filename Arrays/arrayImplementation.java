package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class arrayImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        insertion(arr, sc);
        System.out.println(Arrays.toString(arr));
        deletion(arr, sc);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    private static void insertion(int[] arr, Scanner sc){
        int n = arr.length;
        System.out.println("Enter the elements: ");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
    }

    private static void deletion(int[] arr, Scanner sc){
        int n = arr.length;

        System.out.println("Enter the index to be deleted: ");
        int i = sc.nextInt();

        if(i<0 || i>=n){
            System.out.println("Invalid Index");
            return;
        }

        for(int j = i; j<n-1; j++){
            arr[j] = arr[j+1];
        }
        arr[n-1] = 0;
    }

}
