class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length == 0){
            return 0;
        }
        
        int count = 1;
        int max = 1;
        Set<Integer> freq = new HashSet<>();
        for(int i : nums ){
            freq.add(i);
        }
        int length = 1;

        for(int n : freq){
            if(!freq.contains(n-1)){
                length = 1;
                while(freq.contains(n+length)){
                    length++;
                }
                max = Math.max(max,length);
            }
        }

        return max;
        
    }
}
