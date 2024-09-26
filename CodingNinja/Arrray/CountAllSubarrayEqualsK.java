import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findAllSubarraysWithGivenSum(int arr[], int k) {
        // HashMap to store (cumulative sum, frequency)
        HashMap<Integer, Integer> map = new HashMap<>();
        int cumulativeSum = 0;
        int subarrayCount = 0;

        // Initialize with 0 to account for subarrays starting from the beginning
        map.put(0, 1);

        for (int i = 0; i < arr.length; i++) {
            // Update cumulative sum
            cumulativeSum += arr[i];

            // Check if (cumulativeSum - K) exists in the map
            if (map.containsKey(cumulativeSum - k)) {
                subarrayCount += map.get(cumulativeSum - k);
            }

            // Update the map with the current cumulative sum
            map.put(cumulativeSum, map.getOrDefault(cumulativeSum, 0) + 1);
        }

        return subarrayCount;
    }
}
