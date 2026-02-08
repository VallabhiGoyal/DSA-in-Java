package Arrays;

import java.util.Scanner;

//Create Max Num out of given number
public class CreateMaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Max required number is: " + maxNum(n));
        sc.close();
    }

    //count sort
    private static long maxNum(int n){
        if(n == 0) return 0;
        int temp = n;
        if(n<0){
            temp = Math.abs(n);
        }
        long result = 0;
        int[] arr = new int[10];
        while(temp>0){
            int remain = n%10;
            arr[remain]++;
            temp /= 10;
        }
        for(int i = 9; i >=0; i++){
            while(arr[i]>0){
                result = result*10 + i;
                arr[i]--;
            }
        }
        return result;
    }
}
