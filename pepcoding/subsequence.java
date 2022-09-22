import java.io.*;
import java.util.*;

public class subsequence {

    public static void main(String[] args) {
         ArrayList<String> finall = gss("abc");
         System.out.print(finall);
       
    }

    public static ArrayList<String> gss(String str) {
        //base case
        
        if(str.length()==0) {
        ArrayList<String> base = new ArrayList<>();
               base.add("");
            return base;
        }
        // recursive case
        char ch = str.charAt(0); // will contain a
        String rem_str = str.substring(1); // will contain bc
        ArrayList<String> al = gss(rem_str); // will contain ['',b,c,bc]
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i<al.size(); i++) {
            String s1 = ch + al.get(i);
             ans.add(s1);
        }
       
        for(int i=0; i<al.size(); i++) {
            String s2 = al.get(i);
                    ans.add(s2);

        }
        return ans;
    }
}
