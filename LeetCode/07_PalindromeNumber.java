// my initial solution

class Solution {
    public int count(int n){
        return (int)(Math.log10(n)+1);
    }
    public boolean isPalindrome(int x) {
        if(x <0 ) return false;
        
        int num = x;
        int rev = 0;

        for (int i = 0 ; i <count(x); i++ ){
            rev = rev*10 + num%10;
            num /= 10;

        } 
        if(rev == x) return true;
        else return false;

    }
}

// but this had taken 5ms of time 
// we are having another approach

// *Optimal way*

/*
Instead of reversing the entire number, we can reverse only the last half of the number. 
This approach is tricky because when we reverse the last half of the number, we don't want the middle digit to be reversed back to its original value. 
This can happen if the number has an odd number of digits. To resolve this, we can compare the first half of the number with the reversed second half of the number.
*/

class SolutionOptimal {
    public boolean isPalindrome(int x) {
        int reversedNum=0;
        
        if(x<0 || x%10 == 0 && x!=0){
            return false;
        }
        while(x>reversedNum){
            reversedNum = reversedNum *10 + x%10;
            x /=10;
            
            } 
            return x == reversedNum || x == reversedNum/10;

        }
        
    }
