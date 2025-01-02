class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        num_map = {}
        for num in nums:
            if num in num_map:
                num_map[num] += 1
            else:
                num_map[num] = 1
        
        max_count = -1
        res = -1
        for keys, values in num_map.items():
            if values > max_count:
                max_count = values
                res = keys
        return res