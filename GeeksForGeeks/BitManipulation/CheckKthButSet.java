class CheckBit {
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k) {
        // Your code here
        n = n>>k;
        return( n & 1 )== 1 ? true : false;
    }
}
