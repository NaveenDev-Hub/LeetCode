class Solution {
    public int missingNumber(int[] nums) {
        int allXOR = 0;
        for(int i = 0; i <= nums.length; i++) {
            allXOR = allXOR ^ i;
            System.out.println("Out: " + allXOR);
        }
        for(int num: nums){
            allXOR = allXOR ^ num;
            System.out.println("2nd Out: " + allXOR);
        }
        return allXOR;
    }
}