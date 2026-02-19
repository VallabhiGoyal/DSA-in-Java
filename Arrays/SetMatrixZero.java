package Arrays;

import java.util.Scanner;

public class SetMatrixZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter the number of cols: ");
        int n = sc.nextInt();

        int[][] arr = new int[m][n];
        System.out.println("Enter the elements");
        for(int i =0 ;i<m; i++){
            for(int j = 0; j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        setZeroes(arr);
        System.out.println("Required matrix is: ");
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(matrix[i][j] == 0){
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(rows[i] || cols[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }

}
