import java.util.Scanner;
import java.util.*;
class ar{
public static void main(String args[])
{

    
int temp=0;
//System.out.println(temp);
Scanner n = new Scanner (System.in);
int size =n.nextInt();
int i;
int []arr= new [size];
for(i=0;i<=size;i++)
{arr[i] = n.nextInt();}

System.out.println("enter the element");
int ele = n.nextInt();

System.out.println(ele);
n.close();

int ind=0;
int freq =0;

for (int k=0;k<=3;k++){
    if (arr[k]==ele){
        freq++;
        temp =freq;}

        if (freq>temp)//last occuring index
            ind = k;
}

System.out.println(ind);
}


}
