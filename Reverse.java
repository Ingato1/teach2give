/* Question 5: Reverse Integer */

import java.util.Scanner;
public class Reverse{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input = scanner.nextInt();
        int reversed = reverse(input);
        System.out.println("Reversed integer: " + reversed);
        scanner.close();
    }
    public static int reverse(int num) {
        int reversed = 0;
        int reminder = 0;
        while (num != 0) {
            reminder = num % 10;
            if (reversed > Integer.MAX_VALUE / 10 || reversed < Integer.MIN_VALUE / 10) {
                return 0; 
            }
            reversed = reversed * 10 + reminder;
            num /= 10;
        }
        return reversed;
    }
}
