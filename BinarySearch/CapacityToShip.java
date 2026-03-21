package BinarySearch;

import java.util.Scanner;

public class CapacityToShip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] weights = new int[n];

        for(int i = 0; i < n; i++){
            weights[i] = sc.nextInt();
        }

        int days = sc.nextInt();

        System.out.println(shipWithinDays(weights, days));

        sc.close();
    }
    
    public static int shipWithinDays(int[] weights, int days) {
        int n = weights.length;

        int maxWeight = 0;
        int max = weights[0];
        for(int i = 0; i<n; i++){
            maxWeight += weights[i];
            max = Math.max(max, weights[i]);
        }

        int start = max;
        int end = maxWeight;

        while(start <= end){
            int mid = start + (end - start)/2;
            int currDays = 1;
            int currWeight = 0;
            for(int i = 0; i<n; i++){
                currWeight += weights[i];
                if(currWeight > mid){
                    currDays++;
                    currWeight = weights[i];
                }
                if(currDays > days) break;
            }
            if(currDays > days){
                start = mid + 1;
            }else{
                end = mid-1;
            }
        }

        return start;
    }
}
