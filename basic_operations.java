import java.util.*;
class basic_operations
{
 public static void main(String args[])
{

Scanner ops = new Scanner(System.in);
System.out.println("enter the first number>>>");
int a = ops.nextInt();
System.out.println("enter the second number>>>");
int b = ops.nextInt();
System.out.println("dividend is "+(a/b));
System.out.println("product  is "+(a*b));
System.out.println("difference is "+(a-b));
System.out.println("remainder is "+(a%b));
System.out.println("sum is "+(a+b));
System.out.println("sum is "+(a+b));
System.out.println("XOR  is "+(a^b));
System.out.println("AND is "+(a&b));
System.out.println("OR is "+(a|b));
System.out.println("left shift  is "+(a>>b));
System.out.println("right shift is "+(a<<b));
System.out.println("zero fill shift is "+(a>>>b));

}
}
