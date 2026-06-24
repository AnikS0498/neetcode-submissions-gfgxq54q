class Solution {
    public int maxProduct(int[] nums) {
        int l = nums.length;
        int res = Integer.MIN_VALUE;
        int prefix = 1, suffix = 1;
        for(int i=0;i<l;i++){
            if(prefix == 0)
                prefix = 1;
            if(suffix == 0)
                suffix = 1;
            prefix = prefix * nums[i];
            suffix = suffix * nums[l-i-1];
            
            int temp = Math.max(prefix, suffix);
            if(res < temp)
                res = temp;
        }
        return res;
    }
}
