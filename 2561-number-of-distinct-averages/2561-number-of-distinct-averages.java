class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int left = 0;
        int right = nums.length - 1;
        Set<Double> averages = new HashSet<>();
        while (left < right) {
            double avg = (nums[left] + nums[right]) / 2.0;
            averages.add(avg);
            left++;
            right--;
        }
        int count = averages.size();
        return count;
    }
}