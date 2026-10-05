class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> output = new ArrayList<>();
        Deque<Integer> queue = new ArrayDeque<>();
        int l = 0;
        int r = 0;
        while (r < nums.length) {
            while (!queue.isEmpty() && nums[queue.peekLast()] < nums[r]) {
                queue.pollLast();
            }
            queue.offerLast(r);
            if(r-l+1 == k){
                output.add(nums[queue.peekFirst()]);
                if(l == queue.peekFirst()){
                    queue.pollFirst();
                }
                l++;
            }
            r++;
        }

        return output.stream().mapToInt(Integer::intValue).toArray();
    }
}
