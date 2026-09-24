class Solution {
    public int trap(int[] height) {
       /*  brute force still good in terms of time, didnt get the solution bymyself
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

        return result;*/

        int leftMax = 0;
        int rightMax = 0;
        int left = 0;
        int right = height.length - 1;
        int result = 0;
        while (left < right){
            leftMax = Math.max(leftMax,height[left]);
            rightMax = Math.max(rightMax, height[right]);
            
            if(height[left] <= height[right]){
                result+= leftMax - height[left];
                left++;
            } else{
                 result+= rightMax - height[right];
                 right--;
            }

        }

        return result;

    }
}
