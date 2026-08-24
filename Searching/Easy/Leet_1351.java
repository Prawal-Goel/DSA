class Solution {
    public int countNegatives(int[][] grid) {
        int row=0;
        int col=grid[0].length-1;
        int n=grid.length;
        int count=0;
        while(col>=0&&row<n){
            if(grid[row][col]>=0) row++;
            else {
                count=count+n-row;
                col--;
            }
        }
    return count;
    }
}