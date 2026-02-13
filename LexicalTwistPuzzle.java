import java.util.Scanner;

/**
 * LexicalTwistPuzzle UC3: Validate Single Word Constraint
 *
 * This class Ensure that each input contains only one word.
 *
 * @Developer
 * @version 3.0
 * */


public class LexicalTwistPuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String firstWord = sc.nextLine();

        if(firstWord.trim().contains(" ")){
            System.out.println(firstWord + " is not valid word.");
            return;
        }

        System.out.print("Enter the second word: ");
        String secondWord = sc.nextLine();

        if(secondWord.trim().contains(" ")){
            System.out.println(secondWord + " is not valid word.");
            return;
        }

        System.out.println("Valid word: " + firstWord + " " + secondWord);

        sc.close();
    }
}
