class Solution {
    public boolean isAnagram(String s, String t) {
       // If lengths don't match, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }
        
        // Array to store character frequencies for 'a' through 'z'
        int[] count = new int[26];
        
        // Map characters to indices 0-25 by subtracting 'a'
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        
        // If all frequencies are 0, it's a valid anagram
        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }
        
        return true;
    }
}
