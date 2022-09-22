import java.io.*;
import java.util.*;

public class sumofarraypro {

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
    for(int i=0;i<max ;i++){
        
        
    }
    int[] a3 = new int[n1>n2?n1:n2];
    int i = a1.length-1;
    int j = a2.length-1;
    int k = a3.length-1;
    int c=0;
    while(k>=0) {
        int d=c;
        d+=a1[i];
        d+=a2[j];
        c=d/10;
        d= d%10;
        a3[k]=d;
        k--;
        j--;
        i--;
        
    }
    if(c>0) {
        System.out.println(c);
    }
    for(int l=0;l<k;l++) {
        System.out.println(a3[l]);
    }
    
    
    // write your code here
 }

}
