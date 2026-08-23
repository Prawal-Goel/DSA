class Solution {
    public int specialArray(int[] nums) {
        if(nums.length==0){
            return 0;
        }
      for(int i=1;i<nums.length;i++) {
        int j=i;
        while(j>0 && nums[j-1]>nums[j]){
            int temp=nums[j];
            nums[j]=nums[j-1];
            nums[j-1]=temp;
            j--;
        }
      }
      int n=nums.length;
      for (int i=0;i<nums.length;i++){
        if(nums[i]>=n-i){
            if(i==0||nums[i-1]<n-i)
            return n-i;
        }
      } 
      return -1;
    }
}