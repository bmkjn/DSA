import java.io.*;
import java.util.*;

public class addarraypt2{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n1= scn.nextInt();
    int n2= scn.nextInt();
  
    int[] a1 = new int[n1];
    int[] a2 = new int[n2];
     for(int i =0; i<n1; i++) {
       a1[i] = scn.nextInt();
    }
    for(int i = 0;i<n2; i++) {
        a2[i] = scn.nextInt();
    }
    if (n1>n2) {
        int[] a3 = new int[n1];
    for(int i = 0; i<n2; i++) {
    a3[i] = a1[i] + a2[i];
     System.out.println(a3[i]);
    }
    for (int i=n2; i<n1; i++) {
    a3[i] = a1[i];
    System.out.println(a3[i]);
    }
        
    }
    else {
         int[] a3 = new int[n2];
    for(int i = 0; i<n1; i++) {
    a3[i] = a1[i] + a2[i];
     System.out.println(a3[i]);
    }
    for (int i=n1; i<n2; i++) {
    a3[i] = a2[i];
    System.out.println(a3[i]);
    }
        
    }
    
    
    // write your code here
 }

}
