class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        print("sorted: ", sorted(nums))
        if len(nums) == 0:
            return 0
        sorted_nums = sorted(nums)
        res = 1
        count = 1
        for i in range(len(nums)-1):
            if sorted_nums[i+1] == sorted_nums[i]:
                continue
            if sorted_nums[i+1] - sorted_nums[i] == 1:
                count += 1
                res = max(res, count)
            else:
                count = 1
        return res