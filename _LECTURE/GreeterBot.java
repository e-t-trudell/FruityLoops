public class GreeterBot {
    public static void main(String[] args){
        // creating an instance from a class
        Greeting myGreeting = new Greeting();
        myGreeting.message = "Hello, World!";
        String dateMessage = myGreeting.getCurrentDate();
        System.out.println(dateMessage);
        System.out.println(myGreeting.greet("Eric"));
    }
}
