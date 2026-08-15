class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        for (int i=0;i<accounts.length;i++){ 
            int cash=0;
            for (int j=0;j<accounts[i].length;j++){
                cash=cash+accounts[i][j];
            }
            if(max<cash){
                max=cash;
            }
        }
        return max;
    }
}