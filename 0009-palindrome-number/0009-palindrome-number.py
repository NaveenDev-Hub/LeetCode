class Solution:
    def isPalindrome(self, x: int) -> bool:
        rev = str(x)
        print("actual ", str(x))
        return rev[::-1] == str(x)