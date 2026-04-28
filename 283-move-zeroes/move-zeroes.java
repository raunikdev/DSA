class Solution {
    public void moveZeroes(int[] nums) {
        int indexnonzero = 0;
        int zeros = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[indexnonzero] = nums[i];
                indexnonzero++;
            }else{
                zeros++;
            }
        }
        for(int i=nums.length-1;i>nums.length-1-zeros;i--){
            nums[i] = 0;
        }
    }
}