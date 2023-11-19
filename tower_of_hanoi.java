import java.util.*;
class tower_of_hanoi{
    public static void main(String[] args) {
        Stack<String> A = new Stack<>();
        Stack<String> B = new Stack<>();
        Stack<String> C = new Stack<>();
        A.push("H");
        A.push("A");
        A.push("R");
        A.push("D");
        A.push("I");
        A.push("K");
        System.out.println("original tower --"+A);
        while(A.size()>0)
            B.push(A.pop());
        while(B.size()>0){
            C.push(B.pop());}
            
        System.out.println("new tower --  -- "+C);
        

    }
}