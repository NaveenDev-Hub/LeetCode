class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        left_mul = 1
        right_mul = 1
        left_arr = [0] * n
        right_arr = [0] * n
        for i in range(n):
            j = -i -1
            left_arr[i] = left_mul
            right_arr[j] = right_mul
            left_mul *= nums[i]
            right_mul *= nums[j]
        return [l*r for l,r in zip(left_arr, right_arr)]
