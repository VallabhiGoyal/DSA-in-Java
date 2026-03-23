package BinarySearch;

import java.util.Scanner;

public class StartingIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(findPivot(arr));
        sc.close();
    }
    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            // case 1
            if(mid +1 <= end && arr[mid]>arr[mid+1]){
                return mid + 1;
            }//case 2
            if(mid-1>=start && arr[mid]<arr[mid-1]){
                return mid;
            }//case 3
            if(arr[mid]>=arr[start]){
                start = mid + 1;
            }else{ //case 4
                end = mid - 1;
            }
        }
        return -1;
    }
}
