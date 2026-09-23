class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int i = 0;
        int j = heights.length - 1;
        while (i < j) {
            int min = Math.min(heights[j], heights[i]);
            int current = (j - i) * min;
            max = Math.max(max, current);
            

            if (  min == heights[j] && min != heights[i]) {
                j--;
            }else if ( min == heights[i] && min != heights[j]) {
                i++;
            }else {
                i++;
                j--;
            }
            
        }
        return max;
    }
    
}
