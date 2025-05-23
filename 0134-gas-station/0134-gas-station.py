class Solution:
    def canCompleteCircuit(self, gas: List[int], cost: List[int]) -> int:
        if sum(gas) < sum(cost):
            return -1
        tank = idx = 0
        for i in range(len(gas)):
            tank += gas[i] - cost[i]
            if tank < 0:
                tank, idx = 0, i + 1
        return idx

        print(f"cost: {cost}")
        print(f"gas: {gas}")
        tank = 0
        for i in range(len(cost)):
            # find where we can start
            if cost[i] > gas[i] + tank:
                continue
            start = i
            tank += gas[i]
            print("tank", tank)
            for j in range(start + 1, len(cost)):
                if cost[i] > gas[i]:
                    print("inside", j)
        return -1
