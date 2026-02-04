package Digits;

import java.util.Scanner;

public class DigitalRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n = sc.nextInt();

        //method 1
        System.out.println("Sum by method 1 is: " + sum1(n));

        //method 2
        System.out.println("Sum by method 2 is: " + sum2(n));

        sc.close();
    }   

    //method1
    private static int sum1(int n){
        if(n <= 0) return 0;
        if(n%9!=0) return n%9;
        else return 9;
    }

    //method2
    private static int sum2(int n){
        if(n<0) return 0;
        if(n<=9) return n;

        int result = 0;
        while(n>0){
            result += n%10;
            n /=10;
        }
        
        return sum2(result);
    }
}
