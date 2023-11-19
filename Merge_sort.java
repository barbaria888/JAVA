import java.util.Arrays;
public class Merge_sort {
    public static   void  sort(int [] arr, int low, int high ){
        if(low>=high)return ;
        int mid = low + (high - low ) / 2;
        sort(arr,low,mid);
        System.out.println(Arrays.toString(arr));
        sort(arr,mid+1,high);
        System.out.println(Arrays.toString(arr));
        mergin(arr ,low,mid,high);
    }
    
    public static int[] merge(int[]arr,int l,int m,int h)
    {
        int [] temp = new int[arr.length];
        for ( int i = 0 , j = 0 ; i < (m - l + 1) && j < (h-m) ;  i++,j++){
            int pos=0;
            temp[pos] = arr[j] < arr[i] ? arr[j] : arr[i];pos++;}
        return temp;
        
        }
 
    public static void mergin(int arr[], int l, int m, int r)
     {
            // Find sizes of two subarrays to be merged
            int n1 = m - l + 1;
            int n2 = r - m;
     
            // Create temp arrays
            int L[] = new int[n1];
            int R[] = new int[n2];
     
            // Copy data to temp arrays
            for (int i = 0; i < n1; ++i)
                L[i] = arr[l + i];
            for (int j = 0; j < n2; ++j)
                R[j] = arr[m + j];
     
            // Merge the temp arrays
     
            // Initial indices of first and second subarrays
            int i = 0, j = 0;
     
            // Initial index of merged subarray array
            int k = l;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
                }
                else {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }
     
            // Copy remaining elements of L[] if any
            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }
     
            // Copy remaining elements of R[] if any
            while (j < n2) {
                arr[k] = R[j];
                j++;
                k++;
            }
        }

        public static void main(String[] args) {
            sort(new int[ ] {1,2,34342,1,12,2},0,6);
        }
}
