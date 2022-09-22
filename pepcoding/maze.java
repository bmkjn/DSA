import java.io.*;
import java.util.*;

public class maze {
    public static void main(String[]args) {
      Scanner scn = new Scanner(System.in);
      int i = scn.nextInt();
      int j = scn.nextInt();
        int ans = calls(i,j);
        System.out.print(ans);
    }
    public static int calls(int i, int j) {
        if(i<0 || j<0) return 0;
      if(i==0 && j==0) {
          return 1;
      } 
        int count=0;
        count += calls(i-1, j);
        count += calls(i, j-1);
        count += calls(i-1,j-1);
       return count;
    }

}
