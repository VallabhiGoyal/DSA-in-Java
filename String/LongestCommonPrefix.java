package String;

import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter a elements of the string array: ");
        String[] strs = new String[n];
        for(int i = 0; i<n; i++){
            strs[i] = sc.nextLine();
        }
        System.out.println("Longest Common Prefix is: " + longestCommonPrefix(strs));
        sc.close();
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}
