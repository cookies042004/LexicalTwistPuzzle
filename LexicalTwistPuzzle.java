import java.util.Scanner;

/**
 * LexicalTwistPuzzle UC2: Accept Word Inputs
 *
 * This class Accept two words from the user for puzzle processing..
 *
 * @Developer
 * @version 2.0
 * */


public class LexicalTwistPuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String firstWord = sc.nextLine();

        System.out.print("Enter the second word: ");
        String secondWord = sc.nextLine();

        sc.close();
    }
}
