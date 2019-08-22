class Solution {
    // Insertion Sort Based Solution
    // Time: O(n^2)
    // Space: O(1)
    public void moveZeroesIS(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            int zIndex = -1;
            if(nums[i] == 0)
                zIndex = i;
            if(zIndex != -1){
                for(int j = i + 1; j < nums.length; j++)
                    if(nums[j] != 0) {
                        int temp = nums[j];
                        nums[j] = nums[zIndex];
                        nums[zIndex] = temp;
                        break;
                    }
            }
        }
    }
    // Optimized Solution
    // Time: O(n)
    // Space: O(1)
    public void moveZeroes(int[] nums) {
        int pos = 0;
        for(int i = 0; i < nums.length; i++) 
            if(nums[i] != 0)
                nums[pos++] = nums[i];
        
        for(int i = pos; i < nums.length; i++)
            nums[i] = 0;
    }
}