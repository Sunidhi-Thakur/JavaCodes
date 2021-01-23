package javacodes;
import java.io.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int out[] = new int[2];
        
        for (int i=0; i<nums.length; i++){
            for(int j= i+1; j<=nums.length-1; j++)
            
            if(nums[i]+nums[j] == target){
                
                out[0] = i;
                out[1] = j;
                
            }         
        }
       return out; 
    }
}

public class TwoSum {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the length of array");
        int length = Integer.parseInt(br.readLine());
        System.out.println("Enter the elements of Array");
        int nums[] = new int[length];
        for(int i=0; i<length; i++)
            nums[i] = Integer.parseInt(br.readLine());
        System.out.println("Enter target");
        int target = Integer.parseInt(br.readLine());
        Solution S = new Solution();
        int ans[] = S.twoSum(nums, target);
        System.out.print("Indices that produce target "+target+" = ");
        System.out.println("["+ans[0]+","+ans[1]+"]");
        
    }
    
}
