package Arrays;

import java.util.Scanner;

public class rotate90 {
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

        System.out.println();
        int[][] result = new int[n][m];
        result = rotate(arr);

        System.out.println("Required matrix is: ");
        for(int i =0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    public static int[][] rotate(int[][] arr){
        int a = arr.length;
        int b = arr[0].length;

        int[][] result = new int[b][a];

        //transpose
        for(int i = 0; i<b; i++){
            for(int j = 0; j<a; j++){
                result[i][j] = arr[j][i];
            }
        }

        //reverse
        for(int i =0; i<b; i++){
            for(int j = 0; j<a/2; j++){
                int temp = result[i][j];
                result[i][j] = result[i][a-j-1];
                result[i][a-j-1] = temp;
            }
        }

        return result;
    }
}
