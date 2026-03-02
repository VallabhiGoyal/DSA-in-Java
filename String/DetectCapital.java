package String;

import java.util.Scanner;

public class DetectCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = sc.nextLine();
        System.out.println("Is valid: " + detectCapitalUse(word));
        sc.close();
    }
    public static boolean detectCapitalUse(String word) {
        int n = word.length();

        if(n==1) return true;
        int count = 0;
        for(int i = 0; i<n; i++){
            int ascii = (int)word.charAt(i);
            if(ascii >=65 && ascii<=90) count++;
        }

        if(count == n) return true;
        if(count > 1) return false;
        if(count == 1 && word.charAt(0) >= 'a' && word.charAt(0) <= 'z') return false;
        return true;
    }
}
