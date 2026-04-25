class Solution {
    public int minOperations(int[] nums, int k) {
        int number=0;
        for(int i=0;i<nums.length;i++){
            number += nums[i];
        }
        return number% k;
    }
}