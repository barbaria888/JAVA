import java.util.Arrays;

class Solution {
    public static int[] sortbub(int [] a){
            int x;
            for(int i = 0;i <  a.length ; i++)
                for(int j  =0  ; j < a.length -1 ; j++)
                        if(a[j] > a[j+1])
                           { x = a[j];
                            a[j]  = a[j+1];
                            a[j+1] = x ; }
                           return a;}
    
    public static int[] twoSum(int[] nums, int target) {
        int right   = 1;
        int left = 0 ;
        int sum=0;
        int answer [] =new int[2];
        if(nums ==null || nums.length<=1)
        return answer;
       
       for(int i=0;i<nums.length;i++){
            for(int j = i+1;j<=nums.length-1;j++)
                {sum = nums[i] +nums[j];
                    if(sum==target){
                        answer[0] = i;
                        answer[1]  =j;
                        System.out.println("hi");                        
                        return answer;
                        
                    }
                }
       }/*
        while(right > left && right<arr.length)
            {sum = arr[right] + arr[ left ];
            if(sum == target){
               answer[0] =left;
               answer[1] =right;
               return answer; 
                            }
            right++;
            left++;
            }*/return answer ;}



        
    public static void main(String[] args) {
       int  []a = {3,3};
       int arr[] =  twoSum(a,6);
        /*for(int i=0;i<a.length;i++)
             arr[i] = a[i];*/
        System.out.println(Arrays.toString(arr));
    }
}