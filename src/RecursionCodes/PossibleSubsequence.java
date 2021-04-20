package RecursionCodes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Sunidhi Thakur
 *
 * Print all possible subsequence of a given String
 */
class PossibleSubsequence {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.next();
        System.out.println("Subsequence of" + s + "are: ");
        ArrayList<String> sList = getSubsequence(s);
        System.out.println(sList);

    }

    private static ArrayList<String> getSubsequence(String s) {
        ArrayList<String> s1 = new ArrayList<>();
        if (s.length() == 0) {
            s1.add("");
            return s1;
        }
        char c = s.charAt(0);
        String remaining = s.substring(1);
        ArrayList<String> s2 = getSubsequence(remaining);
        
        ArrayList<String> ans = new ArrayList<>();
        s2.forEach((sub) -> {
            ans.add(""+sub);
        });
        s2.forEach((sub) -> {
            ans.add(c+sub);
        });
        return ans;
    }
}
