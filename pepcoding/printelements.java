import java.util.*;
public class printelements {
    public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);
    int[] arr= new int[5];
    for(int i=0; i<=4; i++) {
        arr[i]= scn.nextInt();
    }
    for(int i=0;i<=4;i++) {
        System.out.print(arr[i]);
    }
        }
}