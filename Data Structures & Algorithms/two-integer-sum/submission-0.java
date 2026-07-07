class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] result = new int[2];
       HashMap<Integer, Integer> store = new HashMap<>();
       for(int i = 0; i < nums.length; i++ ){
        int find = target - nums[i];
            if(store.containsKey(find)){
                result[0] = store.get(find);
                result[1] = i;
            }
            else{
            store.put(nums[i],i);
            }
       }
        return result;
    }
}
