import java.utils.*;
class patterns{
public static void main(String[] args) {
    
for(int i=0;i<=5;i++){
    for(int j=5;j>=i;j--)
        System.out.print(" "); 
    for (int j=0;j<=i;j++)
        System.out.print("*");
    for(int j=0;j<i;j++)
        System.out.print("*");
    System.out.println();
}



String x= "∙";
System.out.println(x);
for(int i=0;i<=5;i++){
    for(int j=0;j<=5;j++){
        if (i==0|j==0|i==5|((i==0)&(j==5)))
            System.out.print("≡"); }
        System.out.println();
   
        
    }

for(int i=0;i<=5;i++){
    for (int j=0;j<=i;j++)
        if(j>1)
        System.out.print("*");
        if (j==2)
        System.out.print("5");
        else
        System.out.print("9");    
    System.out.println();
}     



}}