class Solution {
    public int minimumDeletions(int[] nums) {
        int min=0;
        int max=0;
        for (int i=0;i<nums.length;i++){
            if(nums[max]<nums[i]) max=i; 
            if(nums[min]>nums[i]) min=i; 
        }
        int m1=Math.min(min,nums.length-min-1)+Math.min(max,nums.length-max-1)+2;
        int m2=Math.max(min,max)+1;
        int m3=Math.max(nums.length-max-1,nums.length-min-1)+1;
        int ans=Math.min(m1,m2);
        return Math.min(ans,m3);
    }
}
