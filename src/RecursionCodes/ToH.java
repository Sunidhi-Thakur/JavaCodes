package RecursionCodes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Sunidhi Thakur 
 * 
 * Tower of Hanoi consists of three pegs or towers with n disks placed one over the other. The objective of the puzzle is to move the
 * stack to another peg following these simple rules. 
 * 
 * Only one disk can be moved at a time. 
 * 
 * No disk can be placed on top of the smaller disk. 
 * 
 * Only the top disk can be removed.
 */
public class ToH {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of disks: ");
        int n = Integer.parseInt(br.readLine());
        towerOfHanoi(n, 'A', 'B', 'C');
    }

    private static void towerOfHanoi(int n, char c, char c0, char c1) {
        if(n==0)
            return;
        towerOfHanoi(n-1,c,c1,c0);
        System.out.println("Move Disk "+n+" from "+c+" to "+c0);
        towerOfHanoi(n-1,c1,c0,c);
    }
}
