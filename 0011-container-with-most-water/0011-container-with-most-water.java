class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxVal = 0;
        while(left < right){
            int width = right - left;
            int len = Math.min(height[left], height[right]);
            int res = width * len;
            maxVal = Math.max(maxVal, res);
            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        return maxVal;
    }
}