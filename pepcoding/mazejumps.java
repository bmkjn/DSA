import java.io.*;
import java.util.*;

public class mazejumps {
    public static void main(String[]args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int m = scn.nextInt();
        int ans = calls(1,1,n,m);
        System.out.print(ans);
    }
    public static int calls(int i, int j, int k, int l) {
      if(i==k && j==l) {
          return 1;
      } 
        int count=0;
        for(int a=1; a<=k-i; a++) {
        count += calls(i+a, j, k, l);
        }
        for(int b=1; b<=l-j; b++) {
        count += calls(i, j+b, k, l);
        }
        for(int c=1; c<=k-i && c<=l-j; c++) {
        count += calls(i+c,j+c,k,l);
        }
       return count;
    }

}

