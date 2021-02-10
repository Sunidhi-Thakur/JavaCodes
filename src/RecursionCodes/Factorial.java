package RecursionCodes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Sunidhi Thakur Prints factorial of n. Factorial of n =
 * n*(n-1)*(n-2)*..........*3*2*1 Constraint: n is a positive integer.
 */
public class Factorial {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number: ");
        int n = Integer.parseInt(br.readLine());
        System.out.print("\nFactorial of " + n + " = " + fact(n) + "\n");
    }

    private static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

}
