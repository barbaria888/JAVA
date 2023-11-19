import java.util.*; 
class unique_sum{
    static int binser(int sum,int []a){
        int start =0;
        int end   = a.length - 1 ;
        int mid   = start + (end - start ) / 2;
        int answer =0;
        while(start<=end)
          {if((a[mid-2]+a[mid-1] + a[mid])== sum)
        answer = mid;
         if((a[mid-2]+a[mid-1] + a[mid])<= sum)
            start = mid + 1;
         if((a[mid-2]+a[mid-1] + a[mid])>= sum)
            end = mid -1 ;
            start++;
            end--;
    }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int [] arr =new int[6];

        for(int i : arr)
        {arr[i]= sc.nextInt();}

       System.out.print( binser(sum,arr));
    }
}