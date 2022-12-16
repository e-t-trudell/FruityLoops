import java.util.ArrayList;
public class ExceptionsTest {
    
    public static void main(String[] args){
        // Exception thing = new Exception();
        // try{
        //     thing.deliverMessage();
        //     System.out.println("The message was delivered!");
            
        // }
        // catch (NoSuchMethodException e){
        //     System.out.println("I brought so many brownies!");
        // }
        // ArrayList<Object> objectList = new ArrayList<Object>();
        //     objectList.add("13");
        //     objectList.add("Hello World");
        //     objectList.add(42);
        //     objectList.add("Goodbye World");
        Exception objects = new Exception();
        try{
            // objects.addObjects
            

            objects.addObjects();
            System.out.println("The object was added!");
            System.out.println(objects);
        }
        catch (NoSuchMethodException e){
            System.out.println("I brought too many objects!");
            System.out.println(objects);
            // START HERE add:
            // -the index of the ArrayList where the error occurred, 
            // -and the value of the object that triggered the error. 
            // System.out.println(castedValue);
        }
        

        

    }
}
