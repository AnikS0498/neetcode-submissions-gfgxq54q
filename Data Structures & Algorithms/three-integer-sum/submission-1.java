class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        Set<List<Integer>> set = new HashSet<>();

        for(int i=0;i<n;i++){
            var temp = nums[i];

            var left = i+1;
            var right = n-1;

            while(left < right){
                var sum = temp + nums[left] + nums[right];

                if(sum == 0){
                    set.add(Arrays.asList(temp, nums[left], nums[right]));
                    left++; right--;
                }
                else if(sum < 0){
                    left++;
                }
                else 
                    right--;

            }
        }

        return new ArrayList<>(set);
    }
}
