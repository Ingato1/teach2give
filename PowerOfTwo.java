/* Question 3: Power of Two */

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();

        boolean result = isPowerOfTwo(number);
        System.out.println("Is the number a power of two? " + result);
    }

    public static boolean isPowerOfTwo(int number){
        if(number <= 0)
            return false; 
        return (number & (number - 1)) == 0;
    }
}
