package Sorting;

public class MergeTwoSortedArray1 {
    public static int[] sort(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;

        int[] ans = new int[n+m];

        int i = 0; 
        int j = 0;
        int k = 0;
        while(i<n && j<m){
            if(arr1[i] < arr2[j]){
                ans[k++] = arr1[i++];
            }else{
                ans[k++] = arr2[j++];
            }
        }

        if(i != n){
            while(i<n){
                ans[k++] = arr1[i++];
            }
        }else if(j != m){
            while(j<n){
                ans[k++] = arr2[j++];
            }
        }

        return ans;
    }
}
