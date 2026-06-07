class Solution {
    public int rob(int[] nums) {
        int l = nums.length;
        int[] res = new int[l];

        if (l < 2) {
            return nums[0];
        }

        // if (l == 2) {
        //     res[1] = nums[1];
        //     return Math.max(res[0], res[1]);
        // }

        res[0] = nums[0];
        res[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < l; i++) {
            res[i] = Math.max(res[i - 2] + nums[i], res[i - 1]);
        }

        return res[l - 1];
    }
}
