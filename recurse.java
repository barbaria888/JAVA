import java.util.*;
class mani{
static void  recurse(int end,int []a){
        if(end==0){
            return ;
        }
        int start =0;
        int temp;
        temp =a[start];
        a[start] = a[end] ;
        a[end] = temp;
        start++;
        recurse(end-1,int []a);}
public static void main(String []args){
Scanner sc  = new Scanner(System.in);
		int n= sc.nextInt();
		int[]a = new int[n];
		for (int i=0;i<n;i++)
			a[i] = sc.nextInt();
        int end = a.length;
        recurse(end-1,a);
}}

class harvard{
        public static  void make(int n) {
    if(n<=0)
        return;
    make(n-1);
    for(int i= 0;i<n;i++)
    {System.out.print("*");
}System.out.println();
 
}
public static void main(String[] args) {
        make(9 );
}



}