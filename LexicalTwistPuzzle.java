import java.util.*;

/**
 * LexicalTwistPuzzle UC7: Output Based on Vowel–Consonant Count
 *
 * This class Print characters based on distribution rules.
 *
 Flow
 ✔ If vowels > consonants:
 Print the first 2 unique vowels
 ✔ If consonants > vowels:
 Print the first 2 unique consonants
 ✔ If equal:
 Vowels and consonants are equal

 Key Concepts Used
 ● Ordered filtering
 ● Duplicate removal
 ● Conditional logic
 *
 * @Developer
 * @version 7.0
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

            Set<Character> vowel = new LinkedHashSet<>();
            Set<Character> consonant = new LinkedHashSet<>();

            for(int i = 0;i < combine.length();i++){
                char ch = combine.charAt(i);
                if(ch == 'A' || ch == 'E' || ch == 'I'
                        || ch == 'O' || ch == 'U'){
                    vowels++;
                    vowel.add(ch);
                }
                else if(Character.isLetter(ch)){
                    consonants++;
                    consonant.add(ch);
                }
            }

            if(vowels > consonants){
                int cnt = 0;

                System.out.print("First 2 Unique vowels: ");

                for(char ch : vowel){
                    System.out.print(ch + " ");
                    cnt++;
                    if(cnt == 2)break;
                }
            }
            else if(consonants > vowels){
                int cnt = 0;

                System.out.print("First 2 Unique consonants: ");

                for(char ch : consonant){
                    System.out.print(ch + " ");
                    cnt++;
                    if(cnt == 2)break;
                }
            }
            else{
                System.out.println("Vowels and consonants are equal");
            }
        }

        sc.close();
    }
}
