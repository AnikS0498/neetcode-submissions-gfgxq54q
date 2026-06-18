class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];

        int i =0;
        while(i<l){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                res[0] = map.get(diff);
                res[1] = i;

                return res;
            }
            else{
                map.put(nums[i], i);
            }
            i++;
        }

        return res;
    }
}
