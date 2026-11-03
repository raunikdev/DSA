class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        for(int i=0;i<ans.length;i++){
            if(i<nums.length){
                ans[i] = nums[i];
            }else{
                ans[i] = nums[i-nums.length];
            }
        }
        return ans;
        // int[] arr = new int[nums.length*2];
        // // for(int i=0;i<2;i++){
        // //     for(int j=0;j<nums.length;j++){
        // //         if(i==0){
        // //             arr[j] = nums[j];
        // //         }else{
        // //             arr[j+nums.length] = nums[j];
        // //         }
        // //     }
        // // }
        // for(int i=0;i<nums.length;i++){
        //     arr[i]=nums[i];
        //     arr[i+nums.length] = nums[i];
        // }
        // return arr;


    }
}