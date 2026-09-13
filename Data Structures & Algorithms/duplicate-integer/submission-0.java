class Solution {

    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); // o(1)

        for(int i = 0; i< nums.length; i++) { // O(n)
            if(map.containsKey(nums[i])) { // O(1)
                return true ;
            }

            map.put(nums[i], 1); // O(1)
        }
        return false;
    }
} // O(n)