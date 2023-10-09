import java.util.Arrays;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m, c = 0; i < nums1.length; i++){
            nums1[i] = nums2[c];
            c++;
        }
        Arrays.sort(nums1);
    }
}