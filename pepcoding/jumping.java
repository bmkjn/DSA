import java.util.*;

public class jumping {
    public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int x = scn.nextInt();
    int s = scn.nextInt();
    int[] arr = new int[n];
    int count = 0;
    for(int i=0; i<x; i++) {
        if((s+i)==n) {
            count=1;
            break;
        }
        else{
            count=0;
        }
    }
    if(count==1) {
        System.out.print("Yes");
    }
    else {
       System.out.print("No"); 
    }
  }
    
}
