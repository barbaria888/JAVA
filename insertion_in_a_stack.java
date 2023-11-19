import java.util.Stack;
import java.util.Scanner;
class insertion{
  public static  Stack <Integer> Stack_insert(Stack<Integer> st,long index,int ele){
    Stack <Integer> st1 = new Stack<>();
 boolean f=false;
    int len = st.size();
    
        if(index==0){
             st.push(ele);
             return st;}
    while(st.size()>index){//until the element at i+1 th positon is removed
        if(index > len||index<0)
          {
          System.out.println("Please Enter valid index");
          break;}
          st1.push(st.pop());//adds the elements till given index and pops it from the original stack.
          f = true;
        }
        if(f==true)
        st.push(ele);
        //element gets pushed at index  th index only if the if following element get shifted to the temporary stack
        while(st1.size()!=0)
           st.push(st1.pop());


 return st;
  }

  public static void main(String[] args) {
    Stack <Integer> st = new Stack<>();

    Scanner sc = new Scanner(System.in) ;
    System.out.println("Enter the index at which you want to insert the elment--");
    long index  = sc.nextLong();
    System.out.println("Enter the elment to be added at  "+index+"th index-- ");
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
    //public static Stack ()
            //adds all elements back to original stack with the required ellment at the last index
            

        System.out.println("modded "+Stack_insert(st,index,ele));
        System.out.print("original"+st);
        
        
        //while(j != st.size())
            
   } 
}
