package String;

import java.util.Scanner;

public class RotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String word1 = sc.nextLine();
        System.out.println("Enter second string");
        String word2 = sc.nextLine();
        System.out.println("Is valid: " + rotateString(word1, word2));
        sc.close();
    }

    public static boolean rotateString(String s, String goal) {
        int n = s.length();
        if (n != goal.length()) return false;
        if(s.equals(goal)) return true;

        for(int i = 0; i<n; i++){
            String rotated = s.substring(i) + s.substring(0,i);

            if(rotated.equals(goal)) return true;
        }

        return false;
    }
}
