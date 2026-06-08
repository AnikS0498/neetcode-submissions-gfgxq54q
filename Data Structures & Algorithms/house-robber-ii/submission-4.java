class Solution {
    public int rob(int[] nums) {
        int l = nums.length;

        if(l == 1)
            return nums[0];
        
        if(l == 2){
            return Math.max(nums[0], nums[1]);
        }

        int[] resA = new int[l-1];
        int[] resB = new int[l-1];

        // int[] numsA = new int[l-1];
        // for(int i=0; i<l-1; i++){
        //     numsA[i] = nums[i];
        // }

        resA[0] = nums[0]; resA[1] = Math.max(nums[0], nums[1]);

        for(int i=2; i<=l-2; i++){
            resA[i] = Math.max(resA[i-2] + nums[i], resA[i-1]); 
        }

        int[] numsB = new int[l-1];
        for(int i=1; i<l; i++){
            numsB[i-1] = nums[i];
        }

        resB[0] = numsB[0];
        resB[1] = Math.max(numsB[0], numsB[1]);
        for(int i=2; i<l-1; i++){
            resB[i] = Math.max(resB[i-2] + numsB[i], resB[i-1]); 
        }

        return Math.max(resA[l-2], resB[l-2]);
    }
}
