class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int i=0;
        int j=0;
        while(i<mat.length){
            sum+=mat[i][j];
            i++;
            j++;
        }
        i=0;
        j=mat.length-1;
        while(j>=0){
            if(i!=j)
            sum+=mat[i][j];
            i++;
            j--;
        }
        return sum;
    }
}