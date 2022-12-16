// dynamic arrays
// most used methods for arrays are add, clear, clone, contains, get, indexOf, isEmpty, remove, size
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args){
        int[] myArray = new int[5];

        ArrayList<Integer> myList = new ArrayList<Integer>();

        System.out.println(myList);

        myList.add(10);
        myList.add(11);
        System.out.println(myList);
        // getters 
        Integer num = myList.get(0);
        System.out.println(num);
        // setters
        // index position followed by change
        myList.set(0,9);
        System.out.println(myList);

        // holding different types
        ArrayList<Object> things = new ArrayList<Object>();
        things.add(10);
        things.add("Hello");
        things.add( new ArrayList<Integer>());
        things.add( 12.5);
        System.out.println(things);

    }
}
