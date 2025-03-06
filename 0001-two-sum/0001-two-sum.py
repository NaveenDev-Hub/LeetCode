class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            j = i + 1
            while j < len(nums):
                diff = target - nums[i]
                if diff == nums[j]:
                    return [i,j]
                else:
                    j += 1
                    