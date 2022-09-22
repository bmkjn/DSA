import java.io.*;
import java.util.*;

public class barchart{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++) {
        arr[i] = scn.nextInt();
    }
    int max= arr[0];
    for(int i=0; i<n; i++) {
        if(arr[i] > max) {
            max = arr[i];
        }
    }
    int ht = -1;
    for(ht = max; ht>=1; ht--) {
        for(int i =0; i<n; i++) {
            if(arr[i] >= ht) {
                System.out.print("*\t");
            }
            else {
                System.out.print("\t");
            }
        
        }
        System.out.println();
    }
    // write your code here
 }

}
