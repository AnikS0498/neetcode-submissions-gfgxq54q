class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        if(l == r)
            return nums[l] == target ? l : -1 ;

        while(l<r){
            int m = (l + r) / 2;
            if(nums[m] > nums[r])
                l = m+1;
            else
                r = m;
        }
        
        int p = l;
        if(target == nums[p])
            return p;
        
        l = 0;
        r = nums.length - 1;

        if(target >= nums[l] && p!=0 && target <= nums[p-1])
            r = p-1;
        else 
            l = p+1;

        while(l<=r){
            int m = (l+r)/2;

            if(nums[m] == target)
                return m;
            else if(target > nums[m])
                l = m+1;
            else 
                r = m-1;
        }

        return -1;
    }
}
