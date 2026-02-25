package Arrays_2D;

import java.util.Scanner;

public class rotate180 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int m = sc.nextInt();

        System.out.print("Enter cols: ");
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        System.out.println("Enter elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        rotate180InPlace(arr);

        System.out.println("Rotated matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    public static void rotate180InPlace(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < (m + 1) / 2; i++) {
            for (int j = 0; j < n; j++) {

                int newI = m - 1 - i;
                int newJ = n - 1 - j;

                int temp = matrix[i][j];
                matrix[i][j] = matrix[newI][newJ];
                matrix[newI][newJ] = temp;
            }
        }
    }
}
