package Arrays;

import java.util.Scanner;

public class MulOddIndexed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Multiplication of Odd indexed values is: " + mulOdd(arr));
        sc.close();
    }

    private static int mulOdd(int[] arr){
        int n = arr.length;
        int mul = 1;
        for(int i = 0; i<n; i++){
            if(i%2!=0){
                mul *= arr[i];
            }
        }
        return mul;
    }
}
