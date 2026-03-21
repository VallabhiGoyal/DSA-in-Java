package BinarySearch;

import java.util.Scanner;

public class KokoEatingBanana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of piles");
        int n = sc.nextInt();
        System.out.println("Enter the number of bananas");
        int[] piles = new int[n];
        for(int i = 0; i<n; i++){
            piles[i] = sc.nextInt();
        }
        System.out.println("Enter time in hours");
        int h = sc.nextInt();
        System.out.println("Min Eating Speed " + minEatingSpeed(piles, h));
        sc.close();
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;

        int max = piles[0];
        int min = 1;
        for(int i = 0; i<n; i++){
            max = Math.max(max, piles[i]);
        }

        // ans btw [1, max]
        while(min <= max){
            int mid = min + (max-min)/2;
            int k = 0;
            for(int i = 0; i<n; i++){
                k += (piles[i] + mid - 1) / mid;
                if(k > h) break;
            }
            if(k <= h){
                max = mid - 1;
            }else{
                min = mid + 1;
            }
        }

        return min;
    }
}
