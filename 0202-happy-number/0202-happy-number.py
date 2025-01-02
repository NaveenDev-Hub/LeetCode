class Solution:
    def isHappy(self, n: int) -> bool:
        visits = set()

        while n not in visits:
            visits.add(n)
            n = self.squareOfSum(n)
            if n == 1:
                return True
        return False

    def squareOfSum(self, n: int)-> int:
        output = 0
        while n:
            digit = n % 10
            digit = digit ** 2
            output += digit
            n = n // 10
        return output