class Job{
    String role;
    long salary;
    int id;
}
class Person{
    String name= "";
    Job varJob = new Job();
}
class mrbeast{
    public static void main(String [] args)
    {
        Person p = new Person();
        p.name ="Abhi";
        p.varJob.id  = 10;
        p.varJob.role = "management";
        p.varJob.salary = 120000;
        System.out.println(+  p.varJob.id  +" "+ p.varJob.role +" "+p.varJob.salary);
    }
}