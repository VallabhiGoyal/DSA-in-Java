package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Max3Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        //method2
        System.out.println("Max product of 3 nos. is: " + maxProduct2(arr,n));

        //method1
        System.out.println("Max product of 3 nos. is: " +maxProduct1(arr, n));
        sc.close();
    }

    //method 1 O(NlogN)->Time Complexity
    public static int maxProduct1(int[] arr, int n){
        if(n<3) return 0;
        Arrays.sort(arr);
        int product = Math.max(arr[0]*arr[1]*arr[n-1], arr[n-1]*arr[n-2]*arr[n-3]);
        
        return product;
    }

    //method 2 O(N)->Time Complexity
    public static int maxProduct2(int[] arr, int n){
        if(n<3) return 0;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        int max =  Integer.MIN_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++){

            if(min1>arr[i]){
                min2 = min1;
                min1= arr[i];
            }else if(min2>arr[i]) min2 = arr[i];

            if(max<arr[i]){
                max2 = max1;
                max1 = max;
                max = arr[i];
            }else if(max1<arr[i]){
                max2 = max1;
                max1 = arr[i];
            }else if(max2<arr[i]){
                max2 = arr[i];
            }
        }

        return Math.max(min1*min2*max, max*max1*max2);
    }

}
