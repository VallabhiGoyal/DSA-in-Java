package Digits;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Total number of digits are: " + digits(n));
        sc.close();
    }

    private static int digits(int n){
        int count = 0; 
        while(n>0){
            count++;
            n /= 10;
        }
        return count;
    }
}
