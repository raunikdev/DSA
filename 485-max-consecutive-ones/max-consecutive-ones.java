class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int now = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                now++;
                if(max<now){
                    max = now;
                }
            }else{
                now =0;
            }
        }
        return max;
    }
}