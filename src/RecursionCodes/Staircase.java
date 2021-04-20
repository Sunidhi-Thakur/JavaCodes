package RecursionCodes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author Sunidhi Thakur
 * 
 * There are n stairs, a person standing at the top wants to reach the bottom. 
 * 
 * The person can step down 1 stair, 2 stairs or 3 stairs at a time. 
 * 
 * Count the number of ways, the person can reach the bottom.
 */
public class Staircase{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of stairs");
        int n = Integer.parseInt(br.readLine());
        
        ArrayList<String> ans = getStairsPath(n);
        System.out.println("The paths are "+ ans);
        System.out.println("Tne number of ways are "+ans.size());
    }

    private static ArrayList<String> getStairsPath(int n) {
        if(n == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        else if(n < 0){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }
        ArrayList<String> paths1 = getStairsPath(n-1);
        ArrayList<String> paths2 = getStairsPath(n-2);
        ArrayList<String> paths3 = getStairsPath(n-3);
        
        ArrayList<String> paths = new ArrayList<>();
        paths1.forEach((path) -> {
            paths.add("1"+path);
        });
        paths2.forEach((path) -> {
            paths.add("2"+path);
        });
        paths3.forEach((path) -> {
            paths.add("3"+path);
        });
        return paths;
    }
    
}
