package javacodes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        else{
            int temp = x, rev =0;
            while(temp > 0){
                rev = rev*10+(temp%10);
                temp /= 10;
            }
            if(x == rev)
                return true;
        }
        
        return false;
    }
}
class PalindromeNumberDriver {
    public static void main(String[] args)throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int x = Integer.parseInt(br.readLine());
        
        PalindromeNumber S = new PalindromeNumber();
        if(S.isPalindrome(x))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
