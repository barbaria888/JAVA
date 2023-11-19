import java.util.*;
class stAck{
    public static int [] st =new int[10];
    public  static int top =-1;
    public static int Pushin(int ele){
       
        top += 1;
        st[top] = ele;
    return st[top];}
        
    public static Pop(){
        top -= 1;
        
        st[top]=st[top-1];
        }
    public static int Top(){
        return st[top];
    }            

            
    public static void main(String[] args) {
int arr[] = {1};
System.out.println(arr);
      Scanner sc =  new  Scanner(System.in); 
      stAck.Pushin(5);  
      System.out.println();
        System.out.println(Arrays.toString(st));
}}