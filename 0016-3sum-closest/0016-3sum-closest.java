class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i ++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == target) return sum;
                if(sum < target){
                    left++;
                } else {
                    right--;
                }
                int diffTarget = Math.abs(sum - target);
                if(diffTarget < minDiff) {
                    res = sum;
                    minDiff = diffTarget;
                }
            }
        }
        return res;
    }
}