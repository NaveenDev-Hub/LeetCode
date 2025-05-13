class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for(int j = 0; j < nums2.length; j++) {
            if(set.contains(nums2[j])){
                res.add(nums2[j]);
                set.remove(nums2[j]);
            }
        }
        int[] output = new int[res.size()];
        for(int k = 0; k < output.length; k++) {
            output[k] = res.get(k);
        }
        return output;
    }
}