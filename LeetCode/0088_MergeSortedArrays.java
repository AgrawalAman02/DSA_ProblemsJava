class Solution {

    public void swap(int []nums1,int [] nums2, int i , int j){
        int temp = nums2[j];
        nums2[j] = nums1[i];
        nums1[i] = temp;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0) return;
        if(m==0) {
            for(int i = 0;i<n;i++){
                nums1[i] = nums2[i];
            }
            return;
        }
        // Pointers for nums1, nums2, and the last position of merged array
        int i = m - 1; // Last element in the initial part of nums1
        int j = n - 1; // Last element in nums2
        int k = m + n - 1; // Last position in nums1

        // Merge from the back of the arrays
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // Copy remaining elements from nums2 if any
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
