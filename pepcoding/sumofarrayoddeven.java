import java.util.*;
  
  public class sumofarrayoddeven{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int[] arr= new int[n];
      int x = 0;
      for(int i=0; i<n; i++) {
          int m = scn.nextInt();
          x =x +m;
      }
      if(x%2==0) {
          System.out.print("Even");
      }
      else {
          System.out.print("odd");
      }
       // write ur code here
  
   }
  }
