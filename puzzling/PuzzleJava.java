import java.util.ArrayList;
import java.util.List;
import java.util.Random;
// import java.util.Collectors;
import java.util.stream.Collectors;

public class PuzzleJava {
    Random rando = new Random();
    // rando.ints(20,1) is doing this
        // int nextInt(int origin, int bound) {
        //     int n = bound - origin;
        //     if (n > 0) {
        //       return nextInt(n) + origin;
        //     }
        //     else {  // range not representable as int
        //       int r;
        //       do {
        //         r = nextInt();
        //       } while (r < origin || r >= bound);
        //       return r;
        //     }
        //   }

    public void getTenRolls(ArrayList<Integer> tenRolls){
        ArrayList<Integer> num = new ArrayList<Integer>();
        for (Integer i = 0; i<10; i++){
            Integer random = 1 + rando.nextInt(20-1+1);
            num.add(random);
            // System.out.println("num..." + num);
            tenRolls.add(random);
        }   
    }
    public ArrayList<String> getRandomLetter(ArrayList<String> scarletLetter){
        ArrayList<String> letter = new ArrayList<String>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        // String stringAlphabet = alphabet.toString();
        System.out.println("alphabet..." + alphabet);
        letter.add(alphabet);
        System.out.println("letter..." + letter);
        Integer index = rando.nextInt(26-1+1);
        System.out.println("index..." + index);
        // System.out.println("index letter..." + letter.get(index));
        letter.get(index);
        letter.add(letter.get(index));
        return letter;
    }
    public char getRandomLetter(){
        return (char) (rando.nextInt(26)+ 'A');
    }
    
    // public string generatePassword(){
    //     return string;
    // }
    // public string getNewPassword(){
    //     return string;
    // }
    // // SENSEI BONUS
    // public Arrays suffleArray(){
    //     return Arrays;
    // }
}
