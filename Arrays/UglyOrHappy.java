package Arrays;

import java.util.Scanner;

//Check whether a given number is ugly or happy

public class UglyOrHappy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Is happy: " + isHappy(n));
        System.out.println("Is ugly: " + isUgly(n));
        sc.close();
    }

    //is Happy
    private static boolean isHappy(int n) {
        if(n<=0) return false;
        int slow = n;
        int fast = n;
        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
            
        }while(fast!=1 && slow!= fast);
        
        return slow == 1;
    }
    private static int findSquare(int n){
        int ans = 0;
        while(n>0){
            int rem = n%10;
            ans += rem*rem;
            n=n/10;
        }
        return ans;
    }

    // is ugly
    private static boolean isUgly(int n) {
        if(n<=0) return false;
        int temp = n;
        while(temp%2 == 0){
            temp /= 2;
        }
        while(temp%5 == 0){
            temp /= 5;
        }
        while(temp%3 == 0){
            temp /= 3;
        }

        return temp==1;
    }
}
