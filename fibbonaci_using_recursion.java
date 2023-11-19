import java.util.*;
class fibonacci{
   public static int fibo(int o){
        if(o < 2)
        return o ; 

        return  fibo(o  - 1) + fibo( o  - 2);
         
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        System.out.print(fibo(x));
    }
}