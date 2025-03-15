class Solution:
    def isThree(self, n: int) -> bool:
        if n < 4:
            return False

        root = int(n ** 0.5)
        if n != int(root * root):
            return False

        #find if root is prime
        for i in range(2, int(root ** 0.5) + 1):
            if root % i == 0:
                return False
        return True
