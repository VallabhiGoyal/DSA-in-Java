package Arrays;

import java.util.Scanner;

public class singleOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Missing number is: " + occurOne(arr));
        sc.close();
    }

    public static int occurOne(int[] arr){
        int n = arr.length;

        int ans = 0;
        for(int i = 0; i<n; i++){
            ans ^= arr[i];
        }

        return ans == 0 ? -1  : ans;
    }
}
