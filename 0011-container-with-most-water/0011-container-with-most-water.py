class Solution:
    def maxArea(self, height: List[int]) -> int:
        left = 0
        right = len(height) - 1
        max_unit = 0
        while left < right:
            min_height = min(height[left], height[right])
            curr_unit = (min_height) * (right - left)
            max_unit = max(max_unit, curr_unit)
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        return max_unit