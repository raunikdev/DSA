class Solution {
    public int[] runningSum(int[] nums) {
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            ans += nums[i];
            nums[i] = ans;
        }
        return nums;
        // for(int i =1;i<nums.length;i++){
        //     nums[i] += nums[i-1];
        // }
        // return nums;
    }
}