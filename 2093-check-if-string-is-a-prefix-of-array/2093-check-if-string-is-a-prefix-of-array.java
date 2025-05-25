class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
        for(String word: words){
            sb.append(word);
            System.out.println(sb);
            if(s.equals(sb.toString())) return true;
            if(s.indexOf(sb.toString()) == -1) return false;
        }
        return false;
    }
}