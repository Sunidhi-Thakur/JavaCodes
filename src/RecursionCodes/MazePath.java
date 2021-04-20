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
public class MazePath{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of matrix (n*n)");
        int n = Integer.parseInt(br.readLine());

        System.out.println("Enter source and destination coordinates");
        System.out.println("Enter source row ");
        int sr = Integer.parseInt(br.readLine());
        System.out.println("Enter source column ");
        int sc = Integer.parseInt(br.readLine());
        System.out.println("Enter destination row ");
        int dr = Integer.parseInt(br.readLine());
        System.out.println("Enter destination column ");
        int dc = Integer.parseInt(br.readLine());
        
        ArrayList<String> ans = getMazePath(sr-1, sc-1, dr-1, dc-1);
        System.out.println("The paths from ( "+ sr +"," + sc+") to ("+ dr +","+dc+") ="+ ans);
        System.out.println("The number of ways are "+ans.size());
    }

    private static ArrayList<String> getMazePath(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> hpaths = new ArrayList<>();
        if(sc<dc){
            hpaths = getMazePath(sr, sc+1, dr, dc);
        }
        ArrayList<String> vpaths = new ArrayList<>();
        if(sr<dr){
            vpaths = getMazePath(sr+1, sc, dr, dc);
        }
        ArrayList<String> paths = new ArrayList<>();
        for(String hpath: hpaths){
            paths.add("h"+hpath);
        }
        for(String vpath: vpaths){
            paths.add("v"+vpath);
        }
        return paths;
    }
    
}

/**
 * Output:
 * 
 * Enter the size of matrix (n*n)
 * 
 * 3
 * 
 * Enter source and destination coordinates
 * 
 * Enter source row 
 * 
 * 1
 * 
 * Enter source column 
 * 
 * 1
 * 
 * Enter destination row 
 * 
 * 3
 * 
 * Enter destination column 
 * 
 * 3
 * 
 * The paths from ( 1,1) to (3,3) =[hhvv, hvhv, hvvh, vhhv, vhvh, vvhh]
 * 
 * The number of ways are 6
 **/
