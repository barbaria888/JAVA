class two_pointer{
    public static int swap(int a, int b){
        int c = a;
        a = b;
        b = c;
        return c;
    }
    public static int[] zero_1_sort(int[]a){
        int right = a.length - 1 ;
        int left = 0 ;
        while( right > left ){
            if( a [right]==0 && a[left]==1 )
                swap( a[left] , a[ right ] );
            right-- ;
            left++ ;
        }   
        int [] arr = new int [a.length];
        for(int i=0;i<a.length;i++)
            arr[i] = a[i];
        return a;
    }
    public static void main(String[] args) {
        int []a = {0,0,1,0,1,0,0,1,0,1,1};
         int [] arr = zero_1_sort(a);
         for(int x : arr)
            System.out.print(x + "  ");
    }
}