package String;

import java.util.Scanner;

public class FirstOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string(haystack): ");
        String haystack  = sc.nextLine();
        System.out.println("Enter second string(needle): ");
        String needle = sc.nextLine();
        System.out.println("Required index is: " + strStr(haystack, needle));
        sc.close();
    }
    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if (m == 0) return 0;

        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
