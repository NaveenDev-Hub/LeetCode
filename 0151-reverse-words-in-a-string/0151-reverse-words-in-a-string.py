class Solution:
    def reverseWords(self, s: str) -> str:
        split_string  = s.split()
        result = ' '.join(split_string[::-1])
        return result
        