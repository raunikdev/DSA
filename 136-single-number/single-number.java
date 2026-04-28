class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length-i;j++){
                if(nums[j-1]>nums[j]){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1){
                return nums[i];
            }
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }else{
                i++;
            }
        }
        return nums[nums.length-1];
        
    }
}