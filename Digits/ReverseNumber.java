package Digits;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt(); 
        int rev = reverse(n);
        System.out.println(rev);
        sc.close();   
    }
    public static int reverse(int n){
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev = rev*10 + rem;
            n /= 10;
        }
        return rev;
    }
}
