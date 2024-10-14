class Solution {

    // Helper function to calculate the total hours required to finish all the piles
    // if Koko eats at a speed of 'idx' bananas per hour.
    public int helper(int[] arr, int idx) {
        int ans = 0;
        // Loop through each pile to compute the hours required to finish each pile.
        for (int i = 0; i < arr.length; i++) {
            // Use Math.ceil to round up the division result, ensuring partial piles
            // take an extra hour. We cast to double to avoid integer division.
            ans += Math.ceil((double) arr[i] / (double) idx);
        }
        return ans; // Return the total hours required.
    }

    // Function to determine the minimum eating speed Koko needs to finish all piles within 'h' hours.
    public int minEatingSpeed(int[] piles, int h) {
        // Step 1: Find the maximum pile size since this represents the upper limit of the eating speed.
        int max = Integer.MIN_VALUE; // Initialize max to the smallest possible integer value.
        int n = piles.length; // Store the number of piles.
        for (int i = 0; i < n; i++) {
            // Find the largest pile since Koko can eat at most that many bananas per hour.
            max = Math.max(piles[i], max);
        }

        // Step 2: Binary search between the minimum possible speed (1) and the maximum pile size.
        int lo = 1, hi = max;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2; // Find the middle value (potential eating speed).
            
            // Step 3: Calculate the total hours Koko would take to eat all piles at 'mid' speed.
            int hrs = helper(piles, mid);
            
            // Step 4: Adjust the binary search bounds based on the total hours required.
            if (hrs <= h) {
                // If Koko can finish within 'h' hours or less, try to find a slower speed.
                hi = mid - 1;
            } else {
                // If Koko takes more than 'h' hours, she needs to eat faster.
                lo = mid + 1;
            }
        }

        // Step 5: Return the minimum speed that allows Koko to finish within 'h' hours.
        return lo;
    }
}
