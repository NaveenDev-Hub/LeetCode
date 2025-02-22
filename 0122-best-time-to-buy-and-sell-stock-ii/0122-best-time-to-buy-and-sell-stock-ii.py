class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        cur_hold = -float('inf')
        cur_not_hold = 0
        for stock_price in prices:
            pre_hold = cur_hold
            pre_not_hold = cur_not_hold
            cur_hold = max(pre_hold, pre_not_hold - stock_price)
            cur_not_hold = max(pre_not_hold, pre_hold + stock_price)
        return cur_not_hold
        