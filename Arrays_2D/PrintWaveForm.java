package Arrays_2D;

import java.util.Scanner;

public class PrintWaveForm {
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
        print(arr);
        sc.close();
    }

    public static void print(int[][] arr){
        int a = arr.length;
        int b = arr[0].length;

        int i = 0;
        int j = 0;

        while(j<b){
            System.out.print(arr[i][j] + " ");
            if(j%2 == 0){
                if(i<a-1) i++;
                else j++;
            }else{
                if(i>0) i--;
                else j++;
            }
        }
    }
}
