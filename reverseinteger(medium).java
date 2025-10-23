//Q1-Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
import java.util.*;
class Solution {
    public int reverse(int x) {
       int reverse=0;
       while(x!=0){
        int remainder=x%10;
        if (reverse > Integer.MAX_VALUE / 10 || reverse < Integer.MIN_VALUE / 10) {
                return 0;  // Return 0 if overflow occurs
            }        
        reverse=reverse*10+remainder;
        x=x/10;
       }
        return reverse;
       } 
    }
