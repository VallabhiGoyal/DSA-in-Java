package Arrays;

import java.util.Scanner;

public class SecondLargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Second Largest num is: " + secondLargest(arr));
        sc.close();
    }

    private static int secondLargest(int[] arr){
        int n = arr.length;
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;
        for(int i = 1; i<n; i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            }
        }
        return secondMax == Integer.MAX_VALUE ? -1 : secondMax;
    }
}
