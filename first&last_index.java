import java.util.*;
class removeElements{
    public static int [] first_last(int [] nums,int target){
        int first =-1;
        int last =  -1;
        for(int i=0;i<nums.length;i++){
            if((first == -1)  && (target == nums[i])) first =i;
            else if(target == nums[i] )
            last=i;}
            int answer[] = {first,last} ;

return     answer; }
    public static void main(String[] args) {
        int [] ans = first_last(new int [] {1,8,7,8,9,10} , 8);
        System.out.println(Arrays.toString(ans));
    }
}