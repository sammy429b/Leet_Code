package Arrays;
public class Remove_element {
    class Solution {
        public int removeElement(int[] nums, int val) {
            int k = 0;  // Pointer to the next available position to overwrite
            
            // Iterate through each element of the array
            for (int i = 0; i < nums.length; i++) {
                // If the current element is not equal to the specified value
                if (nums[i] != val) {
                    // Copy the current element to position k and increment k
                    nums[k++] = nums[i];
                }
                // If the current element is equal to the specified value,
                // do nothing as we're removing it from the array
            }
            
            // Return the length of the modified array without the removed elements
            return k;
        }
    }
    
}
