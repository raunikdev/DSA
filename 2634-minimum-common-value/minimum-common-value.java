class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        for(int i=0;i<nums1.length;i++){
            int start = 0;
            int end = nums2.length-1;
            int target = nums1[i];
            while(start<=end){
                int mid = start + (end-start)/2;
                if(nums2[mid] == target){
                    return target;
                }else if(nums2[mid]>target){
                    end = mid -1;
                }else{
                    start = mid +1;
                }
            }

        }
        return -1;
    }
}