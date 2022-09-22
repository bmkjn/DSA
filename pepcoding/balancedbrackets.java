import java.util.*;
public class balancedbrackets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s1.length(); i++) {
            char ch = s1.charAt(i);
            if((ch == '(') || (ch == '{') || (ch == '[')) {
                st.push(ch);
            }
            else {
                char top = st.peek();
    if(((top=='[') && (ch==']')) || ((top=='{') && (ch=='}')) || ((top=='(') && (ch==')'))) {
        st.pop();
            }
                }
        }
        if(st.size()!=0) {
            System.out.print("false");
        }
        else{
            System.out.print("true");

        }
    }
    
}
