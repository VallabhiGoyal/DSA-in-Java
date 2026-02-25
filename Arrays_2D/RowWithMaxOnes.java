package Arrays_2D;

import java.util.Scanner;
import java.util.Arrays;

public class RowWithMaxOnes {
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

        int[] result = rowAndMaximumOnes(arr);
        System.out.println(Arrays.toString(result));
        sc.close();
    }
    public static int[] rowAndMaximumOnes(int[][] mat) {
        int a = mat.length;
        int b = mat[0].length;
        int maxIdx = 0;
        int maxSum = 0;
        for(int  i = 0; i<a; i++){
            int sum = 0;
            for(int j = 0; j<b; j++){
                sum += mat[i][j];
            }
            if(maxSum < sum){
                maxSum = sum;
                maxIdx = i;
            }
        }

        return new int[]{maxIdx, maxSum};
    }
}
