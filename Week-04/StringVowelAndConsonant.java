// String Vowels And Consonants count Program

import java.util.*;

public class StringVowelAndConsonant {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("String: ");

        String string = new String();
        string = scan.nextLine();

        string = string.toLowerCase();
        int vowelCount = 0, ConsonantCount = 0;
        String vowels = "", consonants = "";
        for (int i = 0; i < string.length(); i++) {

            char s = string.charAt(i);
            if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u') {
                vowels += s;
                vowelCount++;
            } else if (s >= 'a' && s <= 'z') {
                consonants += s;
                ConsonantCount++;
            }
        }

        System.out.println("Vowels:     " + vowels + "\t Vowel Count: " + vowelCount);
        System.out.println("Consonants: " + consonants + "\t Consonant Count: " + ConsonantCount);
        scan.close();

    }
}