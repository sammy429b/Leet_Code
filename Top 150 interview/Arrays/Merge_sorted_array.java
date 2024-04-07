package Arrays;
public class Merge_sorted_array {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            // Initialize pointers:
            int i = m - 1; // Pointer for nums1
            int j = n - 1; // Pointer for nums2
            int k = m + n - 1; // Pointer for merged array nums1

            // Merge elements from the end of nums1 and nums2
            while (i >= 0 && j >= 0) {
                // Compare elements from the end of nums1 and nums2
                if (nums1[i] < nums2[j]) {
                    // Place the larger element at the end of nums1
                    nums1[k--] = nums2[j--];
                } else {
                    nums1[k--] = nums1[i--];
                }
            }

            // If there are remaining elements in nums2, add them to nums1
            while (j >= 0) {
                nums1[k--] = nums2[j--];
            }
        }
    }

}