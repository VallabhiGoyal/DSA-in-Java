package Digits;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.println("Result is: " + pow(a,b));
        sc.close();
    }

    public static int pow(int a, int b){
        int result = a;
        for(int i = 1; i<b; i++){
            result = result*a;
        }
        return result;
    }
}
