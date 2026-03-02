package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IsomorphicStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String word1 = sc.nextLine();
        System.out.println("Enter second string");
        String word2 = sc.nextLine();
        System.out.println("Is valid: " + isIsomorphic(word1, word2));
        sc.close();
    }

    public static boolean isIsomorphic(String s, String t) {
        int n = s.length();
        if(n == 1) return true;

        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        for(int i = 0; i<n; i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(map1.get(ch1) == null && map2.get(ch2) == null){
                map1.put(ch1, ch2);
                map2.put(ch2,ch1);
            }else if(map1.get(ch1) != null && map2.get(ch2) != null){
                if(map1.get(ch1) != ch2 || map2.get(ch2) != ch1) return false;
            }else return false;
        }

        return true;
    }
}
