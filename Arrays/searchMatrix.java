package Arrays;

import java.util.Scanner;

public class searchMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of cols: ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        System.out.println("Enter the elements");
        for(int i =0 ;i<n; i++){
            for(int j = 0; j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the target");
        int target = sc.nextInt();
        search(arr, target);
        sc.close();
    }

    //linear search
    public static void search(int[][] arr, int target){
        int n = arr.length;
        int m = arr[0].length;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(arr[i][j] == target){
                    System.out.println("Element found at index");
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }

        System.out.println("Element not found");
    }
}
