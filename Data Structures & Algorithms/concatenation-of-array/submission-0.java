class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        int n = nums.length;
        int j = 0; 
         for (int i = 0; i < ans.length; i++) {
            ans[i] = i >= n ? nums[j++] : nums[i];
    
         }
         return ans;
    }
}