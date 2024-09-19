/*
Problem statement
Sam want to read exactly ‘TARGET’ number of pages.

He has an array ‘BOOK’ containing the number of pages for ‘N’ books.

Return YES/NO, if it is possible for him to read any 2 books and he can meet his ‘TARGET’ number of pages.

Example:
Input: ‘N’ = 5, ‘TARGET’ = 5
‘BOOK’ = [4, 1, 2, 3, 1] 

Output: YES
Explanation:
Sam can buy 4 pages book and 1 page book.

*/

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public static String read(int n, int []book, int target){
        // Write your code here.
        // for(int i = 0 ; i<n-1;i++){
        //     for(int j = i+1; j<n;j++){
        //         if(book[i]+book[j]== target) return "YES";
        //     }
        // }
        
        // return "NO";

        // better approach

        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i = 0 ; i<book.length;i++){
        //     if(map.containsKey(target-book[i])){
        //         return "YES";
        //     }else{
        //         map.put(book[i], i);
        //     }
        // }
        // return "NO";

        // Optimal approach for this question

        Arrays.sort(book);
        int i= 0; int j = book.length-1;
        while(i<j){
            if(book[i]+book[j]==target) return "YES";
            else if(book[i]+book[j]>target) j--;
            else{
                i++;
            }
        }
        return "NO";
    }
}
