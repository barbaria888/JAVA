import java.util.*;

class q20{
    public static void main(String[]args){
for (int i=0;i > 4;i++){
    for(int j=4;j < i;j--){
        System.out.print("*");

    for(int k=0;k<=i;k++)
        System.out.print("*");}
    /*for(int k=4;k<=i;k++){
        System.out.print("*");*/
        /*if (j==i)
    System.out.print("");*/
            System.out.print("\n");}
    
for(int i=0;i<=4;i++){
   for(int k=0;k<=i;k++){
        System.out.print("*");
        if (k==i)
        System.out.print(" ");}
        System.out.println();}
    
   
    }}

class q3{
    public static void main(String[]args){

for(int i=0;i<=5;i++){
        for(int j=0;j<=5-i;j++)
        System.out.print("*");
        for(int j=0;j<=5;j++)
        System.out.print("/");
        /*for(int k =0;k<=5-i;k++)
        System.out.print("*");*/
    System.out.println();}}}

class q4{
    public static void main(String[]args){
    for(int i=0;i<=5;i++)
    {
        for(int j=5;j>=i;j--)
            System.out.print("  ");

        for(int k=0;k<=i;k++)
            System.out.print("* ");
System.out.println();
    }}}





/*  
  * * * * * * 
    * * * * *
      * * * *
        * * *
          * *
            *
                   */
class q5{
    public static void main(String[]args){
    for(int i=0;i<=5;i++){
    for(int k=0;k<=i;k++)
        System.out.print("  ");
    for(int j=0;j<=5-i;j++)
            System.out.print("* ");

        
        
         System.out.println();
                        }
                       
                    } 

                }
 /*
       * * * * * *
             * * * * *
                   * * * *
                         * * *
                               * *
                                     *    
*/
class q6{
    public static void main(String[]args){
    for(int i=0;i<=5;i++)
    {
    for(int k=0;k<=i;k++)
        for(int s=0;s<=5;s++)
            System.out.print(" ");
    
    for(int j=5;j>=i;j--)
        System.out.print(" *");
    

System.out.println();
      }
   }
}



class q7{
    public static void main(String[]args){
    for(int i=0;i<=5;i++)
    {
        for(int j=0;j<=5;j++)
            {if(i==5||i==0)System.out.print("* ");
            else if(j==0||j==5)System.out.print("* ");
        else System.out.print("  ");}
    System.out.println();

    }


}
}

/*
*         * 
 *       *  
  *     *   
   *   *    
    * *     
    * *     
   *   *    
  *     *   
 *       *  
*         *

*/
class q8{
    public static void main(String[]args){
    int n=10;
        for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
            {if(i==j||i + j == n-1)System.out.print("* ");
            else
            System.out.print(" ");}
        
                
        System.out.println();
}}}




/*
            * 
          * * *
        * * * * *
      * * * * * * *
    * * * * * * * * *
  * * * * * * * * * * *
 */
class q9{
    public static void main(String[]args){
    for(int i=0;i<=5;i++)
    {
        for(int k =0;k<=5-i;k++)
            System.out.print("  ");
        for(int j=0;j<=i;j++)
            System.out.print("* ");
        for(int l =0 ;l<=i-1;l++)
        System.out.print("* ");
    System.out.println();
    }
}
}
/*
  * * * * * * * * * * * 
    * * * * * * * * *
      * * * * * * *
        * * * * *
          * * *
            *
*/
class qn{
    public static void main(String[]args){
    for(int i=0;i<=5;i++)
    {for(int k =0;k<=i;k++)
        System.out.print("  ");
for(int j=0;j<=5-i;j++)
    System.out.print("* ");
    for(int l =0 ;l<=5-i-1;l++)
    System.out.print("* ");
System.out.println();
    }
}
}
/*
            * 
          * ! *
        * * * * *
      * ! * ! * ! *
    * * * * * * * * *
  * ! * ! * ! * ! * ! *
  */
class q11{
    public static void main(String[]args){
    for(int i=0;i<=5;i++)
    {for(int k =0;k<=5-i;k++)
        System.out.print("  ");
    for(int j=0;j<=i;j++)
        {if(i%2==0||j%2==0)
    System.out.print("* ");
    else
    System.out.print("! ");}
    for(int l =0 ;l<=i-1;l++)
{     if(i%2==0||l%2==0)
         System.out.print("* ");
       else
          System.out.print("! ");
}
System.out.println();
    }
}
}

/*
* 
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
* 
*/
class q13{
public static void main(String[]args){

for(int i =0;i<=4;i++)
{
    for(int j=0;j<=i;j++)
        System.out.print("* ");
    System.out.println();
}
for(int i=0;i<=5;i++){
    for(int k=0;k<=5-i;k++)
        System.out.print("* ");
System.out.println();}

}
}
class q14{
public static void main(String[]args){

for(int i =0;i<=5;i++)
{
    for(int j=0;j<=5-i;j++)
        System.out.print("  ");
    for(int k=0;k<=i;k++)
        System.out.print("* ");
    System.out.println();
}
for(int i=0;i<=5;i++){
    for(int k=0;k<=i;k++)
        System.out.print("  ");
    for(int j=0;j<=5-i;j++)
        System.out.print("* ");
System.out.println();}

}
}/*
       * * * * * * 
            * * * * * 
                  * * * * 
                        * * *
                              * *
                                    *
                                    * 
                              * *
                        * * *
                  * * * *
            * * * * *
            */
class q15{
    public static void main(String[]args){

for(int i=0;i<=5;i++)
{
    for(int k=0;k<=i;k++)
        for(int s=0;s<=5;s++)
            System.out.print(" ");
    
    for(int j=5;j>=i;j--)
        System.out.print("* ");
    System.out.println();

}
for(int i=0;i<5;i++)
{
    for(int k=0;k<=5-i;k++)
        for(int s=0;s<=5;s++)
            System.out.print(" ");
    
    for(int j=0;j<=i;j++)
        System.out.print("* ");
    System.out.println();


    }}}
class q16{
    public static void main(String[]args){
for(int i=0;i<=5;i++)
{for(int o5=0;o<=5;o++)
    for(int k=5;k>=i;k--)
            System.out.print("  ");
    
    for(int j=0;j<=i;j++)
        System.out.print("* ");
    System.out.println();

}/*
for(int i=0;i>=5;i++)
{
    for(int k=0;k<=i;k++)
    for(int j=0;j<=i;j++)
        System.out.print("* ");

    for(int s= 0;s<=5;s++)
            System.out.print(" ");
    
        System.out.println();
*/
}
}

class q17{
    
    public static void main(String[]args){
int n =0;//sc.nextInt();
n= (n+1)/2;
for(int i=0;i<=3;i++)
{   
    for(int j=0;j<(3-i);j++)
    System.out.print("* ");
    for(int s =0;s<=i;s++)
        System.out.print("  ");
    for(int o = 0; o < i ; o++ )
        System.out.print(" ");
    for(int k=0 ; k<(3-i);k++)
        System.out.print("*");
    System.out.println();   
} 

for(int i=0;i<3;i++)
{   
    for(int j=0;j<i;j++)
    System.out.print("* ");
    for(int s =0;s<3-i;s++)
        System.out.print("  ");
    for(int o = 0; o < 5-i ; o++ )
        System.out.print(" ");
    for(int k=0 ; k<i;k++)
        System.out.print("*");
    System.out.println();   
}   
    
    
    //System.out.println();

}


}

/*
            * 
          * * *
        * * * * *
      * * * * * * *
    * * * * * * * * *
  * * * * * * * * * * *
  * * * * * * * * * * *
    * * * * * * * * *
      * * * * * * *
        * * * * *
          * * *
            *
                         */

class q18{
    
    public static void main(String[]args){
int n =0;//sc.nextInt();
n= (n+1)/2;
for(int i=0;i<=5;i++)
{   
    for(int j=0;j<=(5-i);j++)
        System.out.print("  ");
    for(int s =0;s<=i;s++)
        System.out.print("* ");
    for(int s =0;s<=i-1;s++)
        System.out.print("* ");
    System.out.println();
}

for(int i=0;i<=5;i++)
{   
    for(int j=0;j<=i;j++)
    System.out.print("  ");
    for(int s =0;s<=5-i;s++)
        System.out.print("* ");
    for(int s =0;s<5-i;s++)
        System.out.print("* ");
    System.out.println();
}
}}
/*
* * * * * * * * * * * * 
* * * * *     * * * * *
* * * *         * * * *
* * *             * * *
* *                 * *
*                     *
*                     *
* *                 * *
* * *             * * *
* * * *         * * * *
* * * * *     * * * * *
* * * * * * * * * * * * 
*/
class q19{
    
    public static void main(String[]args){
int n =0;//sc.nextInt();
n= (n+1)/2;
for(int i=0;i<=4;i++)
{   
    for(int j=0;j<=(4-i);j++)
    System.out.print("* ");
    for(int s =0;s<i;s++)
        System.out.print("  ");
    for(int s =0;s<i;s++)
        System.out.print("  ");
    for(int c =0;c<=4-i;c++)
        System.out.print("* ");
     
    System.out.println();
}

for(int i=0;i<=4;i++)
{   
    for(int j=0;j<=i;j++)
     System.out.print("* ");
    for(int s =0;s<=4-i;s++)
        System.out.print("  ");
    for(int s =0;s<4-i-1;s++)
        System.out.print("  ");
    for(int j=0;j<=i;j++)
        System.out.print("* ");
    
System.out.println();
}
}}




class q21{
    
    public static void main(String[]args){
int n =0;//sc.nextInt();
n= (n+1)/2;
for(int i=0;i<=4;i++)
{   
    for(int j=0;j<=(4-i);j++)
    System.out.print("  ");
    for(int s =0;s<i;s++)   
        if(s==i-1)
            System.out.print("* ");
    for(int s =0;s<i;s++)
        System.out.print("   ");
    for(int c =0;c<=4-i;c++)
        if(c==4-i)
        System.out.print("* ");
     
    System.out.println();
}

for(int i=0;i<=4;i++)
{   
    for(int j=0;j<=i;j++)
    if(i==j)
     System.out.print("* ");
    for(int s =0;s<=4-i;s++)
        System.out.print("  ");
    for(int s =0;s<4-i-1;s++)
        System.out.print("  ");
    for(int j=0;j<=i;j++)
        System.out.print("* ");
    
System.out.println();
}
}}