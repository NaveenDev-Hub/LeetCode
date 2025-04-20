class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int kidsWithGreatestCandy = greatestNumber(candies);
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i <candies.length; i ++) {
            int sumValue = candies[i] + extraCandies;
            if (sumValue >= kidsWithGreatestCandy){
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;

    }
    public int greatestNumber(int[] input){
        int max = 0;
        for (int i = 0; i < input.length; i ++) {
            if (input[i] > max){
                max = input[i];
            }
        }
        return max;
    }
}