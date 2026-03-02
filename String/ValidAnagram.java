package String;

import java.util.Scanner;

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String word1 = sc.nextLine();
        System.out.println("Enter first string");
        String word2 = sc.nextLine();
        System.out.println("Is valid: " + isAnagram(word1, word2));
        sc.close();
    }
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] freq = new int[26];

        for(int i = 0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for(int f : freq){
            if(f != 0) return false;
        }

        return true;
    }
}
