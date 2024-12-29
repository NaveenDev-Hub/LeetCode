class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        # list comprehension
        return sorted([num**2 for num in nums])

        #Regular method
        # res = []
        # for num in nums:
        #     res.append(num**2)
        # return sorted(res)
