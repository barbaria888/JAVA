import java.util.*;

class sets{
    public static void main(String[]args )
    {
        Scanner read= new Scanner(System.in);

        int n = read.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int j = 0; j < n; j++) {
            a.add(read.nextInt());
        }
        HashSet<Integer> set= new HashSet<Integer>(a);
        
        for (int  element: set) {
            System.out.print( element+ " ");
        
        }
        System.out.println();
    }
}
