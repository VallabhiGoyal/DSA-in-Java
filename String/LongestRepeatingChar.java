package String;

import java.util.Scanner;

public class LongestRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        System.out.println("Max Len: " + characterReplacement(s, k));
        sc.close();
    }

    public static int characterReplacement(String s, int k) {
        int n = s.length();

        int[] arr = new int[26];
        int i = 0;
        int maxFreq = 0; 
        int maxLen = 0;

        int windowSize = 0;

        for(int j = 0; j<n; j++){
            char ch = s.charAt(j);
            arr[ch-'A']++;

            maxFreq = Math.max(arr[ch-'A'], maxFreq);

            windowSize = j - i + 1;

            if(windowSize - maxFreq > k){
                arr[s.charAt(i) - 'A']--;
                i++;
            }
            maxLen = Math.max(maxLen, j - i + 1);
        }

        return maxLen;
    }
}
