public class Remove_duplicates_from_sorted_array_ii {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int size = nums.length;
            int count = 1;
            int j = 1;
            for (int i = 1; i < size; i++) {
                if (nums[i] == nums[i - 1]) {
                    count++;
                } else
                    count = 1;
                if(count<=2){
                    nums[j++] = nums[i];
                }
            }
            return j;
        }
    }
}
