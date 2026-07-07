class Solution {
    public boolean hasDuplicate(int[] nums) {
        // 1. Sort the primitive array directly
        Arrays.sort(nums);
        
        // 2. Loop until length - 1 so i + 1 never goes out of bounds
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true; // Found a duplicate!
            }
            // Notice: No 'else return false' here. We need to keep looking!
        }
        
        // 3. If we finish the loop without returning true, there are no duplicates
        return false;
        }
        
    }
