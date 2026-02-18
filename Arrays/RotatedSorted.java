package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotatedSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(RS(arr));
        System.out.println(check(arr));
        sc.close();
    }

    //method 1
    public static boolean RS(int[] arr){
        int n = arr.length;
        if(n == 0) return true;

        int min = arr[0];
        int idx = 0;
        for(int i = 0; i<n; i++){
            if(min>arr[i]){
                min = arr[i];
                idx = i;
                System.out.println(i);
            }
        }

        for(int j = idx; j<n-1; j++){
            if(arr[j]>arr[j+1]){
                System.out.println(Arrays.toString(arr));
                return false;
            }
        }

        for(int i = 0; i<idx-1; i++){
            if(arr[i]>arr[i+1]){
                System.out.println(Arrays.toString(arr));
                return false;
            }
        }

        if(idx!=0 && arr[0]<arr[n-1]){
            System.out.println(Arrays.toString(arr));
            return false;
        } 

        return true;
    }

    //method 2
    public static boolean check(int[] nums) {
        int n = nums.length;

        int count = 0;
        for(int i = 0; i<n-1; i++){
            if(nums[i]>nums[i+1]) count++;
        }
        if(count == 1 && nums[0]<nums[n-1]) return false;
        if(count>1) return false;
        return true;
    }
}
