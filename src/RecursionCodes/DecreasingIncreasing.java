package RecursionCodes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Sunidhi Thakur
 * Prints the values of limit n in decreasing and then increasing order
 * Constraint: n >= 1
 */
public class DecreasingIncreasing {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of n");
        int n = Integer.parseInt(br.readLine());
        decInc(n);
    }

    private static void decInc(int n) {
        if(n == 0)
            return;
        System.out.println(n);
        decInc(n-1);
        System.out.println(n);
    }
    
}
