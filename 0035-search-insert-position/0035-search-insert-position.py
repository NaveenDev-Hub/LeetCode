class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        L = len(nums)
        for i,n in enumerate(nums):
            if n >= target:
                return i
            elif i == L-1:
                return i+1
            else:
                continue