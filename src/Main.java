class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int b = nums.length / 2;
        int d = 1;
        int ans = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i+1]){
                d++;
                if(d > b){
                    ans = nums[i];
                    break;
                }
            }else d = 1;
        }
        if(nums.length == 1) ans = nums[0];
        return ans;
    }
}