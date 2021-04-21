package javacodes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Sunidhi Thakur
 */
public class RegularExpressionMatching {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the pattern: ");
        String p = br.readLine();
        System.out.println("\nEnter the String to be checked: ");
        String s = br.readLine();
        boolean ans = isMatch(s, p);
        if(ans)
            System.out.println("String "+s +" matches the pattern "+p);
        else
            System.out.println("String "+s+" does NOT matches the pattern "+p);
    }
        
    
    private static boolean isMatch(String s, String p) {
        if (p.isEmpty())
            return s.isEmpty();
        boolean first_match = (!s.isEmpty() &&
                               (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.'));

        if (p.length() >= 2 && p.charAt(1) == '*'){
            return (isMatch(s, p.substring(2)) ||
                    (first_match && isMatch(s.substring(1), p)));
        } else {
            return first_match && isMatch(s.substring(1), p.substring(1));
        }
    }
}
/**
 * Output:
 * 
 * Enter the pattern: a*b*c
 * 
 * Enter the String to be checked: 
 * 
 * aaac
 * 
 * String aaac matches the pattern a*b*c
*/