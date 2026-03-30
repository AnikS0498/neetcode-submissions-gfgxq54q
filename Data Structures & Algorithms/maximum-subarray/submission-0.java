class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int maxVal = nums[0];
        int currentMax = nums[0];

        for(int i=1; i< len; i++){
            currentMax = Math.max(nums[i], nums[i] + currentMax);

            maxVal = Math.max(currentMax, maxVal);
        }

        return maxVal;
    }
}
