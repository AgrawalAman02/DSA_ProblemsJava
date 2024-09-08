public class Solution {
    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.
        int i=  0, j= 1;
        int length = arr.length;
        for(j  = 1; j<arr.length; j++){
            if(arr[i]== arr[j]){
                length --;

            }
            else{
                i++;
                arr[i] = arr[j];
            }
        }
        return length;
    }
}
