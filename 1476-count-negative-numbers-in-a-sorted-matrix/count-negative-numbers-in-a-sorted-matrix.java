class Solution {
    public int countNegatives(int[][] grid) {
        //add in leetcode
        int output =0;
        for(int i=0;i<grid.length;i++){
            int start =0;
            int end = grid[i].length-1;
            int ans = grid[i].length;
            while(start<=end){
                int mid = start + (end-start)/2;
                if(grid[i][mid]>=0){
                    start = mid +1;
                }else {
                    ans = mid;
                    end = mid -1;
                }
            }
            output += grid[i].length - ans;
        }
        return output;
    }
}