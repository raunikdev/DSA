class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int highest =0;
        int ans =0;
        for(int i=1;i<points.length;i++){
            for(int j=0;j<points[i].length;j++){
                int num = points[i][j] - points[i-1][j];
                if(Math.abs(num)>highest){
                    highest = Math.abs(num);
                }
            }
            ans +=highest;
            highest =0;
        }
        return ans;
    }
}