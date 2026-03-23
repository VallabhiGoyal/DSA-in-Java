package Recurrsion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubsequenceString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        subseq("", str, 0,  list);
        System.out.println(list);
        sc.close();
    }

    public static void subseq(String p, String up, int index, List<String> list){
        if (index == up.length()) {
            list.add(p);
            return;
        }

        char ch = up.charAt(index);

        subseq(p, up, index+1, list);
        subseq(p + ch, up, index+1, list);
    }
}
