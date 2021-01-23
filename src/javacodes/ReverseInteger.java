package javacodes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ReverseInteger {
    public int reverse(int x) {
                int r = 0 ;
        long rev = 0l;
        int temp = Math.abs(x);
        while(temp > 0){
            rev = (rev*10)+(temp%10);
            temp /= 10;
        }
         if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE)
            return 0;
        else if(x < 0 )
            return -(int)rev;
        
        else return (int)rev;

    }
}
class ReverseIntegerDriver {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int x = Integer.parseInt(br.readLine());
        
        ReverseInteger S = new ReverseInteger();
        int ans = S.reverse(x);
        System.out.println("Reverse = "+ans);
       
        
    }
    
}
