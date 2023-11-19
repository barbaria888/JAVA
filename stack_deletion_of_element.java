import java.util.Stack;
import java.util.Scanner;
class deletion{

  public static void main(String[] args) {
    Stack <Integer> st = new Stack<>();
    Stack <Integer> st1 = new Stack<>();
    Scanner sc = new Scanner(System.in) ;
    long index  = sc.nextLong();
     int ele = sc.nextInt();
        st.push(9);
        st.push(8);
        st.push(7);
        st.push(6);
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        st.push(0);
        int n= st.size();       
    while(st.size()!=0){
        int x =st.peek();
        st1.push(st.pop());
        System.out.print(x+"  ");}
        System.out.println();
    while(st1.size()!=0){
        int x = st1.pop();
        System.out.print(x+"  ");}
        
    while(n-1!=0){
        int x = st1.pop();
        System.out.print(x+"  ");}
        
/*    int len =st.size();
    while(st.size()!=index)
     st1.push(st.pop());
    System.out.println("original"+st);
    System.out.println("temporary"+st1);
    int i=0;
    while(len-1<=index)
        {if(i!=index)
            st.push(st.pop());
            i++;}
System.out.println(st);
*/
        }}