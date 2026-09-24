class Solution {
    public int trap(int[] height) {
        
        int[] leftH = new int[height.length];
        int[] rightH = new int[height.length];
        int max = 0;
        int result = 0;
        for(int i = 0; i < height.length; i++){
            max = Math.max(max,height[i]);
            leftH[i] = max;
        }
        max = 0;
        for(int i = height.length-1; i >= 0; i--){
            max = Math.max(max,height[i]);
            rightH[i] = max;
        }

        for(int i = 0; i < height.length; i++){
            result += (Math.min(leftH[i], rightH[i])- height[i]);
        }

        return result;
    }
}
