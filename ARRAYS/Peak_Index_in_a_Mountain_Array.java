public class Peak_Index_in_a_Mountain_Array {
    class Solution {
        public int peakIndexInMountainArray(int[] arr) {
            int index = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i]>arr[i+1]){
                    index= i;
                    break;
                }
            }
            return index;
        }
    }
}
