import java.util.List;
import java.util.TreeSet;

class Solution {
    // Set Solution
    // Time: O(n)
    // Space: O(n)
    public List<Integer> findDisappearedNumbersSet(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();
        
        for(int num : nums)
            set.add(num);
        
        for(int i = 1; i <= nums.length; i++)
            if(!set.contains(i))
                list.add(i);

        return list;
    }
    // Math Solution
    // Time: O(n)
    // Space: O(1)
    public List<Integer> findDisappearedNumbersMath(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            nums[val] = -nums[val];
        }
        for(int i = 0; i < nums.length; i++)
            if(nums[i] > 0)
                list.add(i + 1);
        return list;
    }
}