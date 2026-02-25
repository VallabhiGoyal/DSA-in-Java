package Arrays_2D;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaddlePoint {
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

        List<Integer> list = findSaddlePoint(arr);
        System.out.println(list);
        sc.close();
    }

    public static List<Integer> findSaddlePoint(int[][] matrix){
        int a = matrix.length;
        int b = matrix[0].length;
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i<a; i++){
            int min = matrix[i][0];
            int col = 0;
            for(int j = 0; j<b; j++){
                if(min>matrix[i][j]){
                    min = matrix[i][j];
                    col = j;
                }
            }
            
            boolean isLucky = true;

            for(int k = 0; k<a; k++){
                if(matrix[k][col] > matrix[i][col]){
                    isLucky = false;
                    break;
                }
            }
            if(isLucky) list.add(matrix[i][col]);
        }

        return list;
    }
}
