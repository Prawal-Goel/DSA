class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int r=0;
        while(r<matrix.length){
            int min=Integer.MAX_VALUE;
            int ind=0;
            for (int i=0;i<matrix[0].length;i++){
                if(matrix[r][i]<min) {
                    ind=i;
                    min=matrix[r][i];
                }
            }
            int max=0;
            for (int i=0;i<matrix.length;i++){
                if(max<matrix[i][ind]) max=matrix[i][ind];
            }
            if(matrix[r][ind]==max) list.add(max);
            r++;
        }
    return list;
    }
}