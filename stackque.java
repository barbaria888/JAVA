import java.util.*;
class peeking{
    //ACCESS AN ELEMENT IN STACK AT N TH INDEX WHILE STORING IT IN ANOTHER BUFFER STACK AND THEN RETURNING BACK ALL THE ORIGINAL ELMESTNS TO THE ORIGINAL STACK
    //TIME COMPLEXITY --- O(n)
    //SPACE COMPLEXITY --- O(n)  //WE NEED TO CREATE ANOTHER STACK OF SIZE OF THE GIVEN IN INDEX OF THE ELEMENT FROM ORIGINAL ARRAY
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack <Integer> st1 = new Stack<>(); 
        Scanner sc = new Scanner(System.in);
         
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        //st --- [1,2,3,4,5]
        System.out.println("Enter the index of the stack you want");
        int n = sc.nextInt();
        while(st1.size()!=n)
        {st1.push(st.pop()); }
        System.out.println("The  element at "+n +"th index is is --"+st1.peek());     
        while(st1.isEmpty()==false)
            {st.push(st1.pop());}
        System.out.println(st);
        System.out.println(st1);
        
        System.out.println("size of the new array  = " +st1.size());
        System.out.print(st1);

    }
}
