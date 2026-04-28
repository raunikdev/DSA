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
        if(nums.length==1){
            return nums[0];
        }
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid==nums.length-1 || mid == 0){
                return nums[mid];
            }
            if(mid%2==0){
                if(nums[mid]==nums[mid+1]){
                    start = mid +1;
                }else{
                    if(nums[mid]==nums[mid-1]){
                        end=mid-1;
                    }else{
                        return nums[mid];
                    }
                }
            }else{
                if(nums[mid]==nums[mid-1]){
                    start = mid +1;
                }else{
                    if(nums[mid]==nums[mid+1]){
                        end = mid-1;
                    }else{
                        return nums[mid];
                    }
                }
            }
        }
        return nums[end];
        
    }
}