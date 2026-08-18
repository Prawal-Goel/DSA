class Solution {
    public int maximumPopulation(int[][] logs) {
       int [] track=new int [101];
       for (int[] log:logs){
        track[log[0]-1950]++;
        track[log[1]-1950]--;
       }
       int year=logs[0][0];
       int max=0;
       int pop=0;
       for(int i=0;i<101;i++){
        pop=pop+track[i];
        if(pop>max){
            max=pop;
            year=1950+i;
        }
       }
    return year;
    }
}