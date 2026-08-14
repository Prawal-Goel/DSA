class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int pr=mat.length;
        int pc=mat[0].length;
        if(pr*pc!=r*c) return mat;
        
        else {
            int tempc=0;
            int newmat[][]= new int[r][c];
            for (int i=0;i<r;i++){
                for (int j=0;j<c;j++){
                    newmat[i][j]=mat[tempc/pc][tempc%pc];
                    tempc++;
                }
            }
            return newmat; 
        }
    
    }
}