class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for (int ch : nums){
            int dig=(int)(Math.log10(ch)+1);
            if(dig%2==0){
                count=count+1;
            }
          }
        return count; 
    }
}