import java.util.HashMap;
import java.util.TreeSet;

class  Solution {
    // HashMap Solution
    // Time: O(n)
    // Space: O(n)
    public boolean isUniqueMap(String s) {
        HashMap<Character, Integer> map = new Hashmap<>();
        // Count the characters in our String putting the counts into a hashmap
        for(int i = 0; i < s.length(); i++)
            map.put(s.charAt(i), map.getOrDefault(map.get(s.charAt(index) + 1), 1));
        // Iterate through our string checking if any have a value of 2
        for(int j = 0; j < s.length(); j++)
            // If a key does have a value of 2 return false
            if(map.get(s.charAt(j)) == 2)
                return false;
        // We have checked all of the string and there are no duplicate characters
        return true;
    }

    // HashSet Solution -> Technically speaking this solution is better than the map
    // solution because we reduce our solution to a 1 pass from a 2 pass solution
    // Time: O(n)
    // Space: O(n)
    public boolean isUniqueSet(String s) {
        TreeSet<Character> set = new TreeSet<>();
        // Begin adding characters to our set
        for(int i = 0; i < s.length(); i++) {
            // If our set has the character already return false
            if(set.contains(s.charAt(i)))
                return false;
            // Else we keep adding characters
            set.add(s.charAt((i)));
        }
        // There are no duplicates present in the string 
        return true;
    }

    // Array Solution
    // Time: O(n)
    // Space: O(1)
    // Space is O(1) because the size of the boolean array will never change.
    // Its space complexity is not dependant on the size of the input
    public boolean isUniqueArr(String s) {
        // Initialize a boolean array with size of 256 for ASCII code values
        boolean[] truthy = new boolean[256];
        // Iterate through our array marking characters as seen
        for(int i = 0; i < s.length(); i++) {
            // If a character was already seen before return false
            if(truthy[s.charAt(i)]) return false;
            truthy[s.charAt(i)] = true;
        }
        // There are no duplicates present in the string
        return false;
    }
}

