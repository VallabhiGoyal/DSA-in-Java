package Arrays;

import java.util.Scanner;

public class missingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Missing number is: " + missingNum(arr));
        sc.close();
    }

    public static int missingNum(int[] arr){
        int n = arr.length;

        int[] freq = new int[n+1];
        for(int i = 0; i<n; i++){
            freq[arr[i]]++;
        }
        int ans = 0;
        for(int i = 1; i<n+1; i++){
            if(freq[i] == 0){
                ans = i;
                break;
            }
        }

        return ans == 0 ? -1  : ans;
    }
}
