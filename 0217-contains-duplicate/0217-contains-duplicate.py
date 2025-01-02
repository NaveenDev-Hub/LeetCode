class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        
        if len(nums) < 2:
            return False

        num_map = {}
        for num in nums:
            if num in num_map:
                num_map[num] += 1
            else:
                num_map[num] = 1
        for k in num_map.values():
            if k >= 2:
                return True
        return False