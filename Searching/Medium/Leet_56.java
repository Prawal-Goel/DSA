class Solution {
    public int[][] merge(int[][] intervals) {
        for (int i=1;i<intervals.length;i++){
            int j=i;
            while (j>0 && intervals[j][0]<=intervals[j-1][0]){
                int [] temp=intervals[j];
                intervals[j]=intervals[j-1];
                intervals[j-1]=temp;
                j--;
            }}
            List <List<Integer>> ans=new ArrayList<>();
            int i=0;
            while (i<intervals.length){
                int j=i;
                if(i==intervals.length-1 || intervals[j][1]<intervals[j+1][0]){
                    ans.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            }
                else {
                int max=intervals[i][1];
                while(j<intervals.length-1 && max>=intervals[j+1][0]){
                    max = Math.max(max, intervals[j+1][1]);
                    j++;
                }
                ans.add(Arrays.asList(intervals[i][0],max));
                }
                i=j+1;
            }
        int[][] result = new int[ans.size()][2];

        for (int k = 0; k < ans.size(); k++) {
            result[k][0] = ans.get(k).get(0);
            result[k][1] = ans.get(k).get(1);
        }

        return result;
    }
}
