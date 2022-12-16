import java.util.Date;

// object outline
public class Greeting {
    public String getCurrentDate(){
        Date date = new Date();
        return "Current date is " + date;
    }
    public String message;
// (args) to tell function what is expected for the function, as well as which function to call depending on the args given
    public String greet(String name, Date date){
        return "Hello World" + date;
    }
    public String greet(String name){
        return "Hello World";
    }
}
