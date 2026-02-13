import java.util.Scanner;

/**
 * LexicalTwistPuzzle UC6: Combine Words if Not Reverse
 *
 * This class Merge both words and analyse character distribution.
 *
 * Flow
 * 1. Combine → firstWord + secondWord
 * 2. Convert to uppercase
 * 3. Count vowels and consonants separately
 * Key Concepts Used
 * ● String concatenation
 * ● toUpperCase()
 * ● Character classification
 *
 * @Developer
 * @version 6.0
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
            String combine = firstWord.concat(secondWord).toUpperCase();
            int vowels = 0;
            int consonants = 0;

            for(int i = 0;i < combine.length();i++){
                char ch = combine.charAt(i);
                if(ch == 'A' || ch == 'E' || ch == 'E'
                        || ch == 'O' || ch == 'U'){
                    vowels++;
                }
                else if(Character.isLetter(ch)){
                    consonants++;
                }
            }

            System.out.println("Combined Word: " + combine);
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
        }

        sc.close();
    }
}
