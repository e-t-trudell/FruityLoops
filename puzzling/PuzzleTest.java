import java.util.ArrayList;
// import java.util.Random;
public class PuzzleTest {
    public static void main (String[] args){
        PuzzleJava puzzleMe = new PuzzleJava();
        // Test cases
        System.out.println("\n---Ten Rolls Test---");
        ArrayList<Integer> tenRolls = new ArrayList<Integer>();
        puzzleMe.getTenRolls(tenRolls);
        System.out.println("You did it!" + tenRolls);

        System.out.println("\n---Random Letter Test---");
        ArrayList<String> scarletLetter = new ArrayList<String>();
        puzzleMe.getRandomLetter(scarletLetter);
        System.out.println("You did it!" + scarletLetter);

        // System.out.println("\n---Generate Password Test---");
        // System.out.println("\n---New Password Set Test---");
        // Sensei Bonus
        // System.out.println("\n---Shuffle Array Test---");
    }
}
