import java.util.ArrayList;
import java.util.Random;
// class NoSuchMethodException extends Exception{}
class NoSuchMethodException extends Throwable{}
public class Exception {
    public void addObjects(ArrayList<Object> objectList){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("Hello World");
        myList.add(42);
        myList.add("Goodbye World");
        System.out.println(myList);

        for (int i=0; i <myList.size();i++){
            Integer castedValue = (Integer) myList.get(i);
            System.out.println(i);
            System.out.println(castedValue);
        }
    }
    public boolean addObjects() throws NoSuchMethodException{
        Random r = new Random();
        boolean canAdd = r.nextBoolean();
        if (canAdd){
            return true;
        }
        throw new NoSuchMethodException();
    }
    // public boolean deliverMessage() throws NoSuchMethodException{
    //     Random r = new Random();
    //     boolean hasGas = r.nextBoolean();
    //     if (hasGas){
    //         return true;
    //     }
    //     throw new NoSuchMethodException();
    // } 
     
}
