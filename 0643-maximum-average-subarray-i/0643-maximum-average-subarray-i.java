class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = Double.NEGATIVE_INFINITY;
        int start = 0;
        int end = k - 1;
        
        while(end < nums.length){
            int sum = 0;
            for(int i = start; i <= end; i ++){
                sum = sum + nums[i];
            }
            start++;
            end++;
            double avg = (double) sum / k;
            maxAvg = Math.max(maxAvg, avg);
        }
        return maxAvg;
    }
    
}