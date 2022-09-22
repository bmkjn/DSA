import java.util.*;

public class nextgreaterelement2 {
    public int[] nextGreaterElement2(int[] nums) {
        Scanner scn = new Scanner(System.in);
        int[] nums1 = nums;
        int n = nums1.length;
        int[] nums2 = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i =1; i<2*n; i++) {
            int num = nums1[i%n]
            while(num > st.peek()) {
               
               nums2[st.pop()] = num;
            }
            if(i<n) {
            st.push(i);
            }
           }
           while(!st.isEmpty()) {
               
               nums2[st.pop()] = -1;
           }       
         return nums2;

    }
    public static void main(String[] args) {
        Scanner scn = scn.nextInt();
        int n = scn.nextInt();
        int[] nums1 = new int[n];
        int[] nums2 =  new int[n];
        for(int i =0;i<n;i++){
            nums1[i] = scn.nextInt();

        }

        int[] ans = nextgreaterelement2(nums1,nums2);
    }
    
}
