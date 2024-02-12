/* Question 6: Count Vowels */

import java.util.Scanner;
public class VowelCount{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        sentence = sentence.toLowerCase();

        int vowelCount = 0;
        for (char character : sentence.toCharArray()) {
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                vowelCount++;
            }
        }
        System.out.println(vowelCount + " vowels.");
    }
}
