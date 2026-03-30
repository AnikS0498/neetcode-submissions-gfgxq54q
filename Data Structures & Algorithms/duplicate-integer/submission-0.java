class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        boolean result = false;
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> hm: map.entrySet()){
            if(hm.getValue()>1){
                result = true;
                break;
            }
        }

        return result;
    }
}
