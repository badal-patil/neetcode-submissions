class Solution {
    public boolean isPalindrome(String s) {
        // Clean up the string using a single regex to keep only alphanumeric characters
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        
        // Edge case: an empty string or single char is a palindrome
        if (s.length() <= 1) {
            return true;
        }

        int i = 0, j = s.length() - 1;
        
        // Loop as long as pointers haven't crossed
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false; // Found a mismatch, definitely not a palindrome
            }
            i++;
            j--;
        }
        
        // If we made it through without returning false, it's a palindrome
        return true;
    }
}
