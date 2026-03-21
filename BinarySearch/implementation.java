package BinarySearch;

import java.util.Scanner;

public class implementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the sorted array");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target");
        int target = sc.nextInt();

        int start = 0;
        int end = n-1;
        boolean found = false;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                System.out.println(mid);
                found = true;
                break;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        if(!found) System.out.println(-1);
        sc.close();
    }
}
