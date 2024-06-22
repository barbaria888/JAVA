
// STATIC METHODS CAN'T BE OVERRIDE BUT CAN BE INHERITED
// FINAL  METHODS CAN'T BE OVERRIDEN AND CAN BE INHERITED BUT METHOD WITH SAME NAME IN CHILD CLASS CAN'T BE CREATED
// PRIVATE METHODS CAN NEITHER BE OVERRIDDEN NOR BE INHERITED
  


class brute{
public void overriden(){//ACTUALLY IT IS THE PARENT'S METHOD
System.out.println("from brute");
 //public int x=20;
}
public static void m5(){
    System.out.println("parent static");}
 //cant be used inside any static class inside the brute class but you can access it by making an object 
/*  private void instance_private(){ //PRIVATE MEMBER CANT BE OVERIDED 
    System.out.println("Cant");
}*/


final public void rbi(){
    System.out.println("final from brute parent ");
}

}


class mercy extends brute{
@Override
public static void m5(){
    System.out.println("child static ");
}


public void child(){
    System.out.println("from Mercy");
}


@Override
public void overriden(){
    System.out.println("overriden method i.e method which is present in both but object from CHILD  is called IF REFERENCE IS CHILD ");
}
    


final public void rbi(int x){
    System.out.println("final  rbi from child class ");
}


public static void main(String[] args) {
    mercy n = new mercy();
 n.overriden(); // 
n.child();
//n.m5();
n.rbi(65);
brute m = new brute();
m.overriden();
m.rbi();
//m.m5();
//System.out.println(m.x);
// IF  WE TRY TO ACCESS THE CHILD METHOD WE CAN'T !!! m.child(); ---gives error 
// brutal
brute c = new mercy();
c.overriden();



Object obj = new String();
//String s = new Object();   Type mismatch: cannot convert from Object to String
//System.out.println(obj);
//System.out.println(s);
//  m.instance_private();// The method instance_private() is undefined for the type brute
//  n.instance_private();//  The method instance_private() is undefined for the type mercy


}
}
