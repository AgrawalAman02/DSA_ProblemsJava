/*
  Find all factorial numbers less than or equal to n
  
Difficulty: EasyAccuracy: 48.96%Submissions: 74K+Points: 2

A number n is called a factorial number if it is the factorial of a positive integer. For example, the first few factorial numbers are 1, 2, 6, 24, 120,
Given a number n, the task is to return the list/vector of the factorial numbers smaller than or equal to n.

Examples:

Input: n = 3
Output: 1 2
Explanation: The first factorial number is 1 which is less than equal to n. The second number is 2 which is less than equal to n,but the third factorial number is 6 which is greater than n. So we print only 1 and 2.
Input: n = 6
Output: 1 2 6
Explanation: The first three factorial numbers are less than equal to n but the fourth factorial number 24 is greater than n. So we print only first three factorial numbers.
Expected Time Complexity: O(k), Where k is the number of factorial numbers.
Expected Auxiliary Space: O(1)

Constraints:
1<=n<=1018
*/

class Solution {
    
    public static long factorial(long n){
        if(n==1|| n==2){
            return n;
        }else
        return n*factorial(n-1);
    }
    
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        
        ArrayList<Long> arr = new ArrayList<>();
        long i = 1;
        long fact = 1;
        while(fact<=n){
            
            arr.add(fact);
            i++;
            fact= factorial(i);
            
        }
        return arr;
        
        
    }
}
