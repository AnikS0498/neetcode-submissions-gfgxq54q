class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] prefix = new int[len];
        int[] suffix = new int[len];

        prefix[0] = 1;
        suffix[len - 1] = 1;

        for (int i = 1; i < len; i++) {
            if (i == 1) {
                prefix[i] = nums[i - 1];
            } else {
                prefix[i] = nums[i - 1] * prefix[i - 1];
            }
        }

        for (int j = len - 2; j >= 0; j--) {
            if (j == (len - 2)) {
                suffix[j] = nums[j + 1];
            } else {
                suffix[j] = nums[j + 1] * suffix[j + 1];
            }
        }

        for (int i = 0; i < len; i++) {
            nums[i] = prefix[i] * suffix[i];
        }

        return nums;
    }
}  
