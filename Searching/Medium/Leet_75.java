class Solution {
    public void sortColors(int[] nums) {
        int one=0;
        int two=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                one++;
            }
            else if(nums[i]==1){
                two++;
            }
            else{
                continue;
            }}
            for(int i=0;i<nums.length;i++){
                if(one>0){
                    nums[i]=0;
                    one--;
                }
                else if(two>0){
                    nums[i]=1;
                    two--;
                }
                else {
                    nums[i]=2;
                }
            }
        
    }
}
