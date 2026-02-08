package Arrays;

import java.util.Scanner;

//Check whether a given number can make a valid palindrome or not

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n<0){
            n = Math.abs(n);
        }
        System.out.println("Is Palindrome: " + isPalindrome(n));
        sc.close();
    }

    private static boolean isPalindrome(int n){
        if(n == 0) return true;
        int[] freq = new int[10];

        while(n>0){
            int remain = n%10;
            freq[remain]++;
            n /= 10;
        }
        int oddCount = 0;
        for(int i =0; i<10; i++){
            if(freq[i]%2 != 0){
                oddCount++;
            }
        }
        return oddCount<=1;
    }
    
}
