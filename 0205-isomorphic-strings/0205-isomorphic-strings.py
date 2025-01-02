class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        indexS = [0]* 200
        indexT = [0] * 200

        length = len(s)

        if length != len(t):
            return False
        
        for i in range(length):
            if indexS[ord(s[i])] != indexT[ord(t[i])]:
                return False
            else:
                indexS[ord(s[i])] = i + 1
                indexT[ord(t[i])] = i + 1
        return True

        # if len(s) != len(t):
        #     return False
        # s_map = {}
        # t_map = {}
        # for i in s:
        #     if i in s_map:
        #         s_map[i] += 1
        #     else:
        #         s_map[i] = 1
        # for j in t:
        #     if j in t_map:
        #         t_map[j] += 1
        #     else:
        #         t_map[j] = 1
        # s_val = []
        # t_val = []
        # for ss, tt in zip(s_map.values(), t_map.values()):
        #     s_val.append(ss)
        #     t_val.append(tt)
        # if sorted(s_val) == sorted(t_val):
        #     return True
        # else:
        #     return False
