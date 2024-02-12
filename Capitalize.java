/* Question 4: Capitalize Words */

import java.util.Scanner;
public class Capitalize{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        String capitalizedString = "";
        String[] words = inputString.split(" ");

        for (String word : words) {
            String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
            capitalizedString += capitalizedWord + " ";
        }
        capitalizedString = capitalizedString.trim();
        System.out.println("Result: " + capitalizedString);
    }
}
