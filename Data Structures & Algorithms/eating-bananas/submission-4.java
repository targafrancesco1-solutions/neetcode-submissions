class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int slowest = 1;
        int fastest = 1;
        for (int pile : piles) {
            fastest = Math.max(fastest, pile);
        }
        long hours = 0;

        while (slowest <= fastest) {
            int mid = slowest + (fastest - slowest) / 2;
            for (int i = 0; i < piles.length; i++) {
                int res = (piles[i] + mid - 1) / mid;
                hours += res;
            }
            if (hours > h) {
                slowest = mid + 1;
            } else if (hours <= h) {
                fastest = mid - 1;
            }
            hours = 0;
        }
        return slowest;
    }
}
