class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer>  compare = new HashMap<>();
    
        int difference = 0;
        for (int i = 0; i < nums.length; i++){
            compare.put(nums[i], i);
        }

        for(int i = 0; i< nums.length; i++) {
            difference = target - nums[i];
            if(compare.containsKey(difference) && compare.get(difference) != i){
                return new int[]{i, compare.get(difference)};
            }
        }

        return new int[0];
    }
}
