class Solution:
    def firstUniqChar(self, s: str) -> int:
        mapping = collections.Counter(s)
        for j in range(len(s)):
            if mapping[s[j]] == 1:
                return j
        return -1