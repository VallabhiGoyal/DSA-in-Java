package Basics;
import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        
        if(n<=1){
            System.out.println("false");
            sc.close();
            return;
        }

        boolean isPrime = true;
        for(int i = 2; i<=n/i; i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime);
        sc.close();
        return;
    }
    
}
