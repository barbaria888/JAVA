import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
class array{
    public static void main(String[]args){
        ArrayList <Integer> arr = new ArrayList<Integer>();
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(3);
        arr.add(2);
        Collections.sort(arr);

        System.out.println(arr);
        System.out.println(Collections.max(arr));
        System.out.println(Collections.min(arr));
        System.out.println(Collections.frequency(arr,3));
        Collections.swap(arr,0,1);
        System.out.println(arr);
        ArrayList <String> names= new ArrayList<String>();
        names.add("Ram");
        names.add("Shyam");
        names.add("Lartik");
        
        Collections.sort(names);
        System.out.println(names);
        System.out.println(Collections.max(names));
        Collections.max(arr);


















    }
}