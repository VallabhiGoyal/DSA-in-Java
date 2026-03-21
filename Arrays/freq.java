package Arrays;

import java.util.Scanner;

public class freq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number");
        int target = sc.nextInt();

        int count = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] == target) count++;
        }

        System.out.println(count);
        sc.close();
    }
}
