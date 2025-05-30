class Solution {
    public String kthDistinct(String[] arr, int k) {
        int len = arr.length;
        HashMap<String, Boolean> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < len; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], false);
            } else {
                map.put(arr[i], true);
            }
        }
        for(String ar: arr) {
            if(map.get(ar) == true) {
                count++;
                if(count == k) return ar;
            }
        }
        return "";
    }
}