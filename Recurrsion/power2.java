package Recurrsion;

import java.util.Scanner;

public class power2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(power(n));
        sc.close();
    }

    public static boolean power(int n){
        if(n<=0) return false;

        return (n & (n-1)) == 0;
    }
}
