package Arrays;

import java.util.Scanner;

public class multiplyMatrix {
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
        System.out.println("Enter the number of rows: ");
        int a = sc.nextInt();
        System.out.println("Enter the number of cols: ");
        int b = sc.nextInt();
        int[][] arr2 = new int[n][m];
        System.out.println("Enter the elements");
        for(int i =0 ;i<a; i++){
            for(int j = 0; j<b;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix after multiplication");
        multiply(arr, arr2);
        sc.close();
    }
    public static void multiply(int[][] arr1, int[][] arr2){
        int n = arr1.length;
        int m= arr1[0].length;

        int a = arr2.length;
        int b = arr2[0].length;

        if(m!=a){
            System.out.println("Invalid multiplication");
            return;
        }

        int[][] result = new int[n][b];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<b; j++){
                for(int k = 0; k<a; k++){
                    result[i][j] += arr1[i][k] * arr2[j][k];
                }
            }
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<b; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
