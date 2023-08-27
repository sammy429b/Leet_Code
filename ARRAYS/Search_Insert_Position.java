public class Search_Insert_Position {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int s = 0;
            int e = nums.length - 1;
            int idx = 0;
            while (s <= e) {
                int mid = s + (e - s) / 2;
                if (nums[mid] == target) {
                    idx = mid;
                    break;
                } else if (nums[mid] < target) {
                    s = mid + 1;
                    idx = mid + 1;
                } else {
                    e = mid - 1;
                    idx = mid;
                }
            }
            return idx;
        }
    }
    
}
