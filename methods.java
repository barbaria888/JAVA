import java.util.*;
class Employee{
   private String empName;//the data cant be changed directly through the objects
  private String empId;
 public String getemployname(){
        return empName;
    }
    public void setEmpname(String name){
        empName = name;
    }
    public String getid(){
        return empName;
    }
    public void setempid(String name){
        empId = name;
    }}
    





class Bank{
    private double balance;
    private String name;
public void setname(String n){
    name =n;
}
public String getname()
{
return name;
}
public void setbalance(double b){
    balance = b;
}
public void withdrawal(double amount){
    if(balance>=amount){
        balance -= amount;}
    else{
        System.out.println("insufficient amount");
    }
    
    }


public void deposit(double amount){
    balance +=amount;
}
public double getbalance(){
    return balance;
}

}


public class methods{
    public static void main(String[]args){
/*Employee e = new Employee();
String a =e.getemployname();
System.out.println(a);
String x ="tiger";
e.setEmpname(x);
e.setempid("10990");
System.out.println(e.getemployname());
System.out.println(e.getid());
*/
Bank p1 = new Bank();
Bank p2 = new Bank();
Scanner sc  = new Scanner(System.in);
System.out.println("Enter your username please"); 
String x = sc.next();
p1.setname(x);

System.out.println("Welcome "+p1.getname()+" Enter your amount please..");

System.out.println("Enter your amount to be deposited: ");
double d = sc.nextDouble();
p1.deposit(d);
System.out.println("Enter your amount to be withdrawn: ");
double w = sc.nextDouble();
p1.withdrawal(w);
System.out.println("Your current balance is: "+p1.getbalance());



p2.deposit(2000);
p2.withdrawal(2000);
System.out.println(p1.getbalance());
System.out.println(p2.getbalance());

    }
}