package Arrays_2D;

import java.util.Scanner;

public class Matrix {
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
        rowMajor(arr, n, m);
        System.out.println();
        colMajor(arr, n, m);
        System.out.println();
        diagonal(arr, n, m);
        System.out.println();
        sc.close();
    }

    public static void colMajor(int[][] arr, int n, int m){
        for(int j = 0; j<m; j++){
            for(int i = 0; i<n; i++){
                System.out.print(arr[i][j]);
            }
        }
    }

    public static void rowMajor(int[][] arr, int n, int m){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(arr[i][j]);
            }
        }
    }

    public static void diagonal(int[][] arr, int n, int m){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(i == j){
                    System.out.print(arr[i][j]);
                }
            }
        }
    }
}
