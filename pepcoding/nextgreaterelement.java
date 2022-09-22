import java.util.*;

public class nextgreaterelement {
    public static int[] nextgreaterelement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i =1; i<n; i++) {
            while(nums1[i] > st.peek()) {
               nums2[st.pop()] = nums1[i];
            }
            st.push(i);
           }
           while(!st.isEmpty()) {
               nums2[st.pop()] = -1;
           }       
         return nums2;

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int[] nums1 = new int[n];
        int[] nums2 =  new int[n];
        for(int i =0;i<n;i++){
            nums1[i] = scn.nextInt();

        }
        

        int[] ans = nextgreaterelement(nums1, nums2);
        for(int i=0; i<ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
    
}
