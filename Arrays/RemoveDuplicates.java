package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        removeDuplicates(arr, list);
        System.out.println(list);
        sc.close();
    }

    private static void removeDuplicates(int[] arr, List<Integer> list){
        int n = arr.length;
        if(n == 1){
            list.add(arr[0]);
            return;
        }
        for(int i = 0; i<n; i++){
            int curr = arr[i];
            list.add(curr);

            int j = i+1;
            while(j<n && curr == arr[j]){
                j++;
            }

            i = j-1;
        }
    }
}
