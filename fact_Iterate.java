
// import java.util.Scanner;
// public class fact_Iterate {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a positive integer: ");
//         int n = sc.nextInt();
//         int factorial = 1 ;
//         for (int i = 1; i <= n; i++) {
//             factorial *= i;
//         }

//         System.out.println("Factorial of " + n + " is " + factorial);
//     }

// }

import java.math.BigInteger;
import java.util.Scanner;

public class fact_Iterate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System. out.print("Enter a positive integer: ");

        // Input validation
        if (!sc.hasNextInt()) {
            System.out.println(" Please enter a valid integer.");
            sc.close();
            return;
        }

        int n = sc.nextInt();
        sc.close();

        if (n < 0) {
            System.out.println(" Factorial is not defined for negative numbers.");
            return;
        }

        //  For smaller numbers (<=13), use int (faster, simpler)
        if (n <= 13) {
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println(" Factorial of " + n + " is: " + factorial);
        } 
        //  For larger numbers, use BigInteger
        else {
            BigInteger factorial = BigInteger.ONE;
            for (int i = 1; i <= n; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
            System.out.println(" Factorial of " + n + " is:\n" + factorial);
        }
    }
}
