class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int pst =0;
        int neg =1;

        int[] positive = new int[nums.length/2];
        int[] negative = new int[nums.length/2];

        for(int i= 0;i<nums.length;i++){
            if(nums[i]>0){
                arr[pst] = nums[i];
                pst = pst+2;
            }else{
                arr[neg] = nums[i];
                neg = neg+2;
            }
        }
        return arr;

        
    }
}