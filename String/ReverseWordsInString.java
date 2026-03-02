package String;

import java.util.Scanner;

public class ReverseWordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = sc.nextLine();
        System.out.println("Reversed String: " + reverseWords(word));
        sc.close();
    }

    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        StringBuilder str = new StringBuilder();
        for(int i = words.length-1; i>=0; i--){
            str.append(words[i]).append(" ");
        }
        return str.toString().trim();
    }
}
