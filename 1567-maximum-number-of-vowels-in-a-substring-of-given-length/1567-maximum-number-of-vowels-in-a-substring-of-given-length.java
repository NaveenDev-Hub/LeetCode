class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a'); vowels.add('e'); vowels.add('i');
        vowels.add('o'); vowels.add('u'); 
        int maxWinCount = 0;
        int maxCount = 0;
        for (int i = 0; i < k; i++){
            if(vowels.contains(s.charAt(i))) {
                maxWinCount++;
            }
        }
        maxCount = maxWinCount;
        for(int i = k; i < s.length(); i++){
            if(vowels.contains(s.charAt(i-k))) {
                maxWinCount--;
            } 
            if(vowels.contains(s.charAt(i))){
                maxWinCount++;
            }
            maxCount = Math.max(maxCount, maxWinCount);
        }
        return maxCount;
    }
}