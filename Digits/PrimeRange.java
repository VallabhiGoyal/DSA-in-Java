package Digits;

import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Number of prime numbers is: " + rangePrime(a,b));
        sc.close();
    }

    private static boolean Prime(int n){
        if(n<=1){
            return false;
        }
        boolean isPrime = true;
        for(int i = 2; i<=n/i; i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    private static int rangePrime(int a, int b){
        int count = 0;
        for(int i = a; i<=b; i++){
            if(Prime(i)) count++;
        }
        return count;
    }
}
