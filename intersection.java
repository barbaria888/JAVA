import java.util.Arrays;
class Solutin{
    public static int[] intersection(int[] nums,int [] nums2){
        int n=0;
          nums = Arrays.stream(nums).distinct().toArray();
         nums2 = Arrays.stream(nums2).distinct().toArray();
        int len =  (nums.length>nums2.length)?(nums.length) : (nums2.length);
        int ans[]=new int [len];
       int count =0;
         for(int i=0;i<=len;i++)
            for(int j=0;j<=len;j++)
            {if(nums[i]==nums2[i])
                 ans[i] = nums[i];
                 count++;
                                    }
                                    int i=0;
            for(int x:ans)
                {           ans[i] = x;
            i++;}
            
            return ans;
    }
    public static void main(String[] args) {
        int [] sit =intersection(new int[] {1,3,4},new int []{8,123,12,1,2,7,3,4}); 
        System.out.println(Arrays.toString(sit));
for(int x:sit)
System.out.print(" "+x);
//        System.out.println(intersection(new int[]{1,3,4},new int[]{8,123,12,1,2,7,3,4}));
    }
}