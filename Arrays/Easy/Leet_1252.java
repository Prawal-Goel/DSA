class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int [][] nums=new int[m][n];
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                nums[i][j]=0;
            }
        }
        for (int i=0;i<indices.length;i++){
            for (int j=0;j<n;j++){
                nums[indices[i][0]][j]+=1;
            }
        }
        for (int i=0;i<indices.length;i++){
            for (int j=0;j<m;j++){
                nums[j][indices[i][1]]+=1;
            }
        }
        int count=0;
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if(nums[i][j]%2!=0) count++;
            }
        }
        return count;
    }
}