class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int middle = 0;
        int end = nums.length - 1;
        while (middle <= end) {
            if(nums[middle] == 0) {
                swap(nums, middle, start);
                middle++;
                start++;
            }
             else if (nums[middle] == 1) {
                middle++;
            } else if(nums[middle] == 2) {
                swap(nums, middle, end);
                end--;
            }
        }
    }
    public void swap(int[] num, int a, int b) {
        int temp = num[a];
        num[a] = num[b];
        num[b] = temp;
    }
}