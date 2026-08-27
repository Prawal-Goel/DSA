class Solution {
    public int singleNonDuplicate(int[] nums) {
       int start =0;
       int end=nums.length-1;
       if(nums.length==1){
        return nums[0];
       }
       if(nums[start]!=nums[start+1]) return nums[start];
       if(nums[end]!=nums[end-1]) return nums[end];
       while (start<=end){
        int mid= start+(end-start)/2;
        if(nums[mid]==nums[mid+1]){
            if((nums.length-mid)%2!=0) start=mid+2;
            else end=mid-1;
        }
        else if(nums[mid]==nums[mid-1]) {
            if((mid-1)%2!=0) end=mid-2;
            else start=mid+1;
        }
        else return nums[mid];
       }
       return 0;
    }
}
