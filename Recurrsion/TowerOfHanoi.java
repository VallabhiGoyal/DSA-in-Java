package Recurrsion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rings");
        int n = sc.nextInt();
        tower(n, 'A', 'B', 'C');
        sc.close();
    }

    public static void tower(int n, char src, char helper, char dest){
        if(n == 0) return;
        tower(n-1, src, dest, helper);
        System.out.println(n + "-->" + src + "-->" + dest);
        tower(n-1, helper, src, dest);
    }
}
