import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    public static long[] sortbub(long [] a) {
            long x;
            for(int i = 0;i <  a.length ; i++)
                for(int j  =0  ; j < a.length -1 ; j++)
                        if(a[j] <a[j+1])
                        {
                          x = a[j];
                          a[j]  = a[j+1];  
                          a[j+1] = x ; 
                                                  System.out.println("jth-- "+a[j]+" j+1 th -- "+a[j+1]);

                        }
         
         return a;               }
         
	public static void main (String[] args)
	{
		Scanner sc =new Scanner(System.in);
		//int  t = sc.nextInt();
		//for(int i=0;i<t;i++){
		int n;
		//n =sc.nextInt();
        long []arr = {45 ,76 ,91 ,21 ,9};
        for(int ko=0;ko<arr.length;ko++)
        System.out.print(+arr[ko]+"  ");
        System.out.println();
		//long [] arr  = new long[n];
            		/*for(int j=0;j<n;j++){
		    arr[j] = sc.nextLong();
		}*/

        arr = sortbub(arr);
        for(int ko=0;ko<arr.length;ko++)
        System.out.print(+arr[ko]+"  ");
        System.out.println();
				}
	}


    