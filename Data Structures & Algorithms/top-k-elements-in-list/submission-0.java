class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> frequency = new HashMap<>();
        PriorityQueue<Map.Entry<Integer,Integer>> heap = new PriorityQueue<>(
            (a,b) -> Integer.compare(b.getValue(),a.getValue())
        );
        int[] output = new int[k];
        for(int i : nums){
            if (frequency.containsKey(i)) {
                frequency.put(i , frequency.get(i) + 1);
            }else {
                frequency.put(i,1);
            }

        }

        //Hashmap filled with frequency for every number
        // heap filled with all the entries so you can have the association
        heap.addAll(frequency.entrySet());

        for (int i = 0; i < k; i++) {
            int temp = heap.poll().getKey();
            output[i] = temp;
        }

        return output;
    }
}
