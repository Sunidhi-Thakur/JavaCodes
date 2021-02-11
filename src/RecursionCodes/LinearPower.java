package RecursionCodes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Sunidhi Thakur 
 * Prints x to the power n.
 * Constraint: x > 0, n >= 0
 * 
 */
public class LinearPower {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number: ");
        int x = Integer.parseInt(br.readLine());
        System.out.print("Enter power: ");
        int n = Integer.parseInt(br.readLine());
        System.out.print(x+" raised to the power " + n + " = " + power(x,n) + "\n");
    }

    private static float power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

}
