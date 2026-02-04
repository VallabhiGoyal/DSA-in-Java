package Digits;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(reverse(n));
        sc.close();
    }

    public static boolean reverse(int n){
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev = rev*10 + rem;
            n /= 10;
        }
        return rev==n;
    }
}
