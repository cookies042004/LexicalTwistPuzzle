import java.util.Scanner;

/**
 * LexicalTwistPuzzle UC4: Check Reverse Relationship
 *
 * Determine whether the second word is the reversed version of the first word
 * (case-insensitive).
 *
 * @Developer
 * @version 4.0
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

        String reversed = new StringBuilder(firstWord).reverse().toString();

        if (reversed.equalsIgnoreCase(secondWord)) {
            System.out.println("Second word is the reverse of first word.");
        } else {
            System.out.println("Not a reverse match.");
        }

        sc.close();
    }
}
