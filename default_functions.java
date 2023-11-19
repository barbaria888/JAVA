import java.util.Stack;
import java.util.Scanner;
class sstque{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        st.push(0);
    
        System.out.println(st.get(3));

    }
}