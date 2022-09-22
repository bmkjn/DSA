import java.io.*;
import java.util.*;

public class mazepath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> path = getmazepath(1,1,n,m); // 1,1 to n,m
        System.out.print(path);

    }
    public static ArrayList<String> getmazepath(int a, int b, int c, int d) {
        if(a==c && b==d) {
            ArrayList<String> emp = new ArrayList<>();
            emp.add("");
            return emp;
       }
        if(b>d || a>c) {
            return new ArrayList<>();
        }
        ArrayList<String> word1 = getmazepath(a, b+1, c, d);
        ArrayList<String> word2 = getmazepath(a+1, b, c, d);
        ArrayList<String> ans = new ArrayList<>();
         for(String s: word1) {
             String s1 = "h" + s;
             ans.add(s1);
         }
         for(String s: word2) {
            String s2 = "v" + s;
            ans.add(s2);
        }
       return ans; 

    }
    
}
