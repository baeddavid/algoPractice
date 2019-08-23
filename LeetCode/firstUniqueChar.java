import java.util.HashMap;

class Solution {
    // Hashmap Solution
    // Time: O(n)
    // Space: O(1) -> Although we use map, the problem states there are only 
    // lower cases in the string. This means we can guarantee that there is always
    // a maximum space of 26.
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap();
        for(int i = 0; i < s.length(); i++) 
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        for(int i = 0; i < s.length(); i++)
            if(map.get(s.charAt(i)) == 1)
                return i;
        return -1;
    }
}