class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0;
        int n = nums.length;
        int maxZeros = 0;
        int maxCount = 0;
        for(int end = 0; end < n; end++){
            if(nums[end] == 0){
                maxZeros++;
            }
            while(maxZeros > k){
                if(nums[start] == 0){
                    maxZeros--;
                }
                start++;
            }
            maxCount = Math.max(maxCount, end - start + 1);
        }
        return maxCount;
    }
}