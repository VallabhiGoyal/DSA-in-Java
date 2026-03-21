package Arrays;

import java.util.Scanner;

public class LowerBound{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target = sc.nextInt();

        System.out.println(lower(arr, target));
        sc.close();
    }

    public static int lower(int[] arr, int target){
        int n = arr.length;

        for(int i = 0; i<n; i++){
            if(arr[i] >= target) return i;
        }

        return -1;
    }
}