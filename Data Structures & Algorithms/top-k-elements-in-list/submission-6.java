class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] freq = new List[nums.length + 1];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i]))
                map.put(nums[i], 1);
            else
                map.put(nums[i], map.get(nums[i]) + 1);
        }

        for (int key : map.keySet()) {
            int frequency = map.get(key);
            if (freq[frequency] == null) {
                freq[frequency] = new ArrayList<>();
            }
            freq[frequency].add(key);
        }

        int[] result = new int[k];
        int count = 0;
        for (int i = freq.length - 1; i >= 0 && k > count; i--) {
            if (freq[i] != null) {
                for (Integer j : freq[i]) {
                    result[count++] = j;
                }
            }
        }

        return result;
    }
}
