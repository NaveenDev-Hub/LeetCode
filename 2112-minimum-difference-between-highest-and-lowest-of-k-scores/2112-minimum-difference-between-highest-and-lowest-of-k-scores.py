class Solution:
    def minimumDifference(self, nums: List[int], k: int) -> int:
        nums.sort()
        L = 0
        R = k - 1
        res = float("inf")
        while R < len(nums):
            res = min(res, nums[R]-nums[L])
            L += 1
            R += 1
        return res