package Arrays;

import java.util.Scanner;

public class AddEvenIndexed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum of Even indexed values is: " + evenIndex(arr));
        sc.close();
    }

    private static int evenIndex(int[] arr){
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i<n; i++){
            if(i%2==0){
                sum += arr[i];
            }
        }
        return sum;
    }
}
