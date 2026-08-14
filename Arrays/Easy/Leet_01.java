class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0;i<nums.length-1;i++){
            int j=i+1;
            while(j<nums.length){
                if(nums[j]+nums[i]==target){
                    return new int[]{i,j};
                }
                j++;
            }
        }
    return new int[]{-1,-1};
    }
}