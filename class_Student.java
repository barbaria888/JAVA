import java.util.*;
class Student{ //class creation
    String name;
    int age;
    float cpi;


}
class test{
public static void main(String[]args){
Student s = new Student();               //object creation
Scanner sc = new Scanner(System.in);
System.out.println("Enter the name: ");
s.name = sc.next();
System.out.println("Enter the age: ");
s.age = sc.nextInt();
System.out.println("Enter the CPI: ");
s.cpi = 9.0f;
System.out.println("The age is :"+s.age);
System.out.println("The cpi is :"+s.cpi);
System.out.println("The name is :"+s.name);


/// s is a instance variable i.e it contains data in the parameters of one class
// value of in

}
}