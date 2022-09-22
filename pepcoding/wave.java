import java.io.*;
import java.util.*;

public class wave {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
       for(int b=0; b<arr[0].length; b++) {
           if(b%2==0) {
               for(int a=0; a<arr.length; a++) {
                   System.out.println(arr[a][b]);
               }
            }
               else {
                   for(int a = arr.length-1; a>=0; a--) {
                    System.out.println(arr[a][b]);
                   }
               }
       } 
    }
    
}
