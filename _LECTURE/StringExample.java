public class StringExample {
    public static void main(String[] args){
        // String myString = "Hello, World!";
        // String otherString = "Nice to meet you!";
        // int myInt = 9;
        // System.out.println(myString + otherString);
        String myString = "    \"Hello, Everyone!\"    \n";
        String mySubStr = "llo";
        int subStrLength = mySubStr.length();
        // below prints out the first instance where the string follows exactly
        int myIndex = myString.indexOf(mySubStr);
        if (
            myString.substring(myIndex - 1, myIndex).equals(" ") 
            && 
            myString.substring(myIndex + subStrLength).equals(" ")
            ){
                System.out.println(myIndex);
            }
        else{
            myString.substring(myIndex +1).indexOf(mySubStr);
            
        }
        // System.out.println(String.format("Hello to all %s", 9));
        System.out.println(myIndex);

        // Explicit Castings
        // ArrayList<Object> myList = new ArrayList<Object>();
        // myList.add(1);
        // myList.add(3);
        // myList.add(4);
        // myList.add(23);
        // myList.add(132);
        // Long myId = (Long) myList.get(2);
        // System.out.println(myId);
    }
}
