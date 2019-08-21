import java.util.HashMap;
import java.util.Arrays;

class Solution {
    // HashMap Solution
    // Time: O(n)
    // Space: O(n)
    public int singleNumberMap(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // Count instances of elements in nums using a hashmap
        for(int num : nums) {
            if(map.containsKey(num))
                map.put(num, map.get(num) + 1);
            else
                map.put(num, 1);
        }
        // If any key has a value of 1, that is our answer
        for(int key : nums)
            if(map.get(key) == 1)
                return key;
        // If our map does not have any values of 1, return -1
        return -1;
    }

    // Bit Solution
    // Time: O(n)
    // Space: O(1)
    public int singleNumberXOR(int[] nums) {
        // Initialize our answer to 0
        int answer = 0;
        // Iterate through our array performing XOR on our answer.
        for(int i = 0; i < nums.length; i++)
            answer ^= nums[i];
        // We are left with the bits left over with is our single number.
        return answer;
    }
}