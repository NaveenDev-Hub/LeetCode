class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals = sorted(intervals)
        prev = intervals[0]
        merged_list =[]
        i = 1
        for interval in intervals[1:]:
            curr = interval
            if curr[0] <= prev[1]:
                prev[1] = max(curr[1], prev[1])
            else:
                merged_list.append(prev)
                prev = curr
        merged_list.append(prev)
        return merged_list