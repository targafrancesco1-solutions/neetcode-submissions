class Solution {
    public int[] twoSum(int[] nums, int target) {

        // create an hashmap i put the value

        Map<Integer, Integer> track = new HashMap<>();
        int diff = 0; 
        for(int i = 0; i< nums.length;i++){
            diff = target - nums[i];
            if(track.containsKey(diff)){
                return new int[] {track.get(diff),i};
            }
            track.put(nums[i], i);
        }

        return null;
    }
}
