import java.util.Arrays;
import java.util.HashMap;

class Solution {
    // Sort Solution
    // Time: O(n log n)
    // Space: O(1)
    public boolean permuteCheckSort(String s, String t) {
        // Convert both our strings to char arrays
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();
        // Sort both char arrays
        Arrays.sort(S);
        Arrays.sort(T);
        // Convert both char arrays back into strings
        s = String(S);
        t = String(T);
        // Return their equality 
        return S.equals(T);
    }
    
    // ASCII Solution
    public boolean permuteCheckAscii(String s, String t) {
        
    }
}