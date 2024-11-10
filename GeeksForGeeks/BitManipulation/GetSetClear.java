class Solution {
    static void bitManipulation(int num, int i) {
        // code here
        // first
        int get = (num >>( i-1)) &1;
        long set = num | (1<<(i-1));
        long clear =  num & ~(1<<(i-1));
        
        System.out.print(get + " " + set + " " + clear);
        
    }
}
