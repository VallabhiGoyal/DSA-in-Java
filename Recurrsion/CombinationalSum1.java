package Recurrsion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombinationalSum1 {
    public static List<List<Integer>> ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the array");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target sum");
        int target = sc.nextInt();

        ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        System.out.println("number of required subsets are: "+ subset(arr, target, 0, 0, n, temp));
        System.out.println(ans);

        sc.close();
    }

    public static int subset(int[] arr, int target, int sum, int idx, int n, List<Integer> temp){
        if(sum == target){
            ans.add(new ArrayList<>(temp));
            return 1;
        }
        if(idx == n|| sum > target) return 0;

        //take
        temp.add(arr[idx]);
        int take = subset(arr, target, sum+arr[idx], idx, n, temp);
        temp.remove(temp.size()-1);
        

        //remove
        int skip = subset(arr, target, sum, idx+1, n, temp);

        return take + skip;
    }
}
