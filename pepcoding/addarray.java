import java.io.*;
import java.util.*;

public class addarray{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n= scn.nextInt();
  
    int[] a1 = new int[n];
    int[] a2 = new int[n];
    
    for(int i =0; i<n; i++) {
       a1[i] = scn.nextInt();
    }
    for(int i = 0;i<n; i++) {
        a2[i] = scn.nextInt();
    }
    int[] a3 = new int[n];
    for(int i = 0; i<n; i++) {
    a3[i] = a1[i] + a2[i];
     System.out.println(a3[i]);
    }
    // write your code here
 }

}