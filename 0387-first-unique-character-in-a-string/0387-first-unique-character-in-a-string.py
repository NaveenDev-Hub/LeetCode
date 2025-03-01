class Solution:
    def firstUniqChar(self, s: str) -> int:
        mapping = {}
        for i,v in enumerate(s):
            if s[i] in mapping:
                mapping[v] += 1
            else:
                mapping[v] = 1
        for j in range(len(s)):
            if mapping[s[j]] == 1:
                return j
        return -1