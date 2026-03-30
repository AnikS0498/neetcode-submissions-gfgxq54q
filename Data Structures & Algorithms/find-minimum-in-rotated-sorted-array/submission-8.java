class Solution {
    public int findMin(int[] nums) {
        int r = nums.length - 1;
        int l = 0;
        if(nums[l] < nums[r])
            return nums[l];
        if(l == r)
            return nums[l];
        return binarySearch(nums, l, r);
    }

    public int binarySearch(int[] nums, int l, int r){
       
        while(l<r){
            int m = (l + r) / 2;
            if(nums[m] > nums[r])
                l = m+1;
            else
                r = m;
        }
        
        return nums[l];
    }
}
