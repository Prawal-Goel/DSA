class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int min=0;
        for (int i=0;i<candies.length;i++){
            if(candies[i]>min){
                min=candies[i];
            }
        }
        ArrayList<Boolean> result=new ArrayList<>();
        for (int i=0;i<candies.length;i++){
            if((extraCandies+candies[i])>=min){
                result.add(true);
            }
            else result.add(false);
        }
    return result;
    }
}