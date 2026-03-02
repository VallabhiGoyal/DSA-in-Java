package String;

import java.util.Scanner;

public class RansomNote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String word1 = sc.nextLine();
        System.out.println("Enter second string");
        String word2 = sc.nextLine();
        System.out.println("Is valid: " + canConstruct(word1, word2));
        sc.close();
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int n = magazine.length();

        int[] ch = new int[26];
        for(int i = 0; i<n; i++){
            ch[magazine.charAt(i)-'a']++;
        }

        for(int i = 0; i<ransomNote.length(); i++){
            ch[ransomNote.charAt(i)-'a']--;
            if(ch[ransomNote.charAt(i)-'a']<0) return false;
        }

        return true;
    }
}
