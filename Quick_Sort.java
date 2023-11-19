import java.util.*;
class QuickSort
{
    public static void swap(int []arr,int a, int b){
        int c = arr[a];
        arr[a] = arr[b];
        arr[b] =  c;
    
    }
    public static int [] Qsort(int [] nums ,int low, int high)
    {int pindex=0;
        if(low<high)
        {
         pindex = mergeIn(nums, low, high-1);
         System.out.println("pindex-- "+pindex);
        
        Qsort(nums , low, pindex );
        System.out.println("left array --  "+Arrays.toString(nums));
        Qsort(nums , pindex , high - 1);
            System.out.println("right array -- "+Arrays.toString(nums));
    }


        return nums;
    }
    public static int mergeIn (int [] arr, int low ,int high)
    {
        int pivot = arr[low];
        System.out.println("pivot -- "+pivot);
        int i=low , j=high; 
        while(i<j )
        {
            while ( arr[i] <=pivot  && i <= high )
            {
                i++;
            }
            while ( arr[ j ] > pivot  )
            {
                j--;
            }
            if(i<j ) swap(arr,i,j);
        }
        swap(arr,low, j);
        return j;
    }

        public static void main(String[] args)
         {
            int [] req = new int [] {4,7,3,1,5,2,6,8};
            int [] ans = Qsort(req,0,req.length-1);
            System.out.println(Arrays.toString(ans));
        }
}




