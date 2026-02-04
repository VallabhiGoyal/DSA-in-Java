package Digits;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Sum is: " + sum(n));
        sc.close();
    }

    private static int sum(int n){
        int result = 0;
        while(n>0){
            result += n%10;
            n /= 10;
        }
        return result;
    }
}
