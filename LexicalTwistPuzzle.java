import java.util.Scanner;

/**
 * LexicalTwistPuzzle UC5: Transform Word if Reverse Match
 *
 * This class Apply transformations when the second word is the reverse of the first.
 *
 * @Developer
 * @version 5.0
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
            System.out.println("Reverse Matched");
            String lower = reversed.toLowerCase();
            String transformed = lower.replaceAll("[aeiou]", "@");
            System.out.println("Transformed word: " + transformed);
        } else {
            System.out.println("Not a reverse match.");
        }

        sc.close();
    }
}
