package Recurrsion;

import java.util.Scanner;

public class powerOfX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        System.out.println("Enter second number");
        int n = sc.nextInt();
        System.out.println(myPow(x,n));
        sc.close();
    }
    public static double myPow(double x, int n) {
        if(n == 0) return 1;
        if(x == 0) return 0;

        if(n < 0){
            return 1 / helper(x, -(long)n);
        }

        return helper(x, n);
    }

    public static double helper(double x, long n){
        if(n == 0) return 1;

        double half = helper(x, n/2);

        if(n % 2 == 0){
            return half * half;
        }else{
            return x * half * half;
        }
    }
}

