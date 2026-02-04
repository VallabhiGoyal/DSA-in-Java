package Digits;

import java.util.Scanner;

public class StrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(strong(n));
        sc.close();
    }

    public static boolean strong(int n){
        int temp = n;
        int result = 0;
        while(temp>0){
            int rem = temp % 10;
            result += fact(rem);
            temp /= 10;
        }

        return result == n;
    }

    public static int fact(int n){
        if(n<0) return 0;
        if(n==1 || n==0) return 1;
        return n*fact(n-1);
    }
}
