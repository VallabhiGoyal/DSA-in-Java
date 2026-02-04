package Digits;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(arm(n));
        sc.close();
    }
    public static boolean arm(int n){
        int count = 0;
        int temp = n;
        while(temp>0){
            count++;
            temp /= 10;
        }
        temp = n;
        int result = 0;
        while(temp>0){
            int rem = temp%10;
            result += Math.pow(rem, count);
            temp /= 10;
        }

        return result == n;
    }
}
