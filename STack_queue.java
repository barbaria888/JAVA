import java.util.*;
class stonk{
    public static void main(String[]args){
Scanner sc = new Scanner(System.in);
 Stack <Integer> st = new Stack<>();
int x=0;
for(int i=0;i<5;i++){
x =sc.nextInt();
st.push(x);
}
System.out.println(st);
st.pop();
System.out.println(st);
    }
}

class q_{
    public static void main(String[]args){
    Queue q = new LinkedList();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    System.out.println(q);
    q.remove();
    System.out.println(q);
}
}