import java.util.Scanner;
class sc{
public static void main(String args[]){
//scanner object creation
Scanner mynew= new Scanner(System.in);
System.out.println("enter the desired pattern-->");
//entering the data into the mynew object
int n = mynew.nextInt();
//printing by retrieving the data from mynew class
System.out.println(n);
mynew.close();
if (n==1){
star1(n);
}

if(n==2){
     star2(n);
  }}


public static int star1(int a ){
int n = a*a;
return n;
}
public  static int star2( int a){
int n = a+a;
return n;
}


}



