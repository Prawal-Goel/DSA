class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre = 1;
        int post = 1;
        int temp = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                pre = pre * temp;
            }
            if (i < nums.length - 1) {
                int j = i + 1;
                post = 1;
                while (j < nums.length) {
                    post = post * nums[j];
                    j++;
                }
            } else
                post = 1;
            temp = nums[i];
            nums[i] = pre * post;
        }
        return nums;
    }
}
