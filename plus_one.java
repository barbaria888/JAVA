import java.util.Arrays;

class plus{
    public static int digit_num(int num){
        int c=0;
        while(num>0){
            c++;
            num/=10;
        }return c;
    }
    public static int  plus_one(int [] nums){
        int number = 0;
        
        for( int i=0; i< nums.length;i++)
            number += nums[i] * Math.pow(10,nums.length - i);

        int sol = number+1;
        int len = digit_num(sol);
        int [] a=new int [ len + ( digit_num[number] -  len)];
        

        int i=1;
        while(number>0)
        {
            a[len -i] = number%10;
            number /=10;
            i++;
        }
        return a;
        }
            public static void main(String[] args) {
             System.out.println(  Arrays.toString( plus_one(new int []{1,2,3} )
             
             
             ));
            }
    }
