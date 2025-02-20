// import java.util.Scanner;

// public class FactorialCalculator {
//     public static void main(String[]arg) {
//     Scanner scanner = new Scanner(System.in);

//     System.out.print("Enter a positive integer: ");



//     }
// }

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a positive integer: "); 
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;

            // Calculating factorial
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }
}

