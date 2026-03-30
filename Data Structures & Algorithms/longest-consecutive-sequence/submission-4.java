class Solution {
    public int longestConsecutive(int[] nums) {
        int sequence = 0;
        int maxSequence = Integer.MIN_VALUE;

        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }

        if(set.size() == 1){
            return 1;
        }

        for (int i : set) {
            var prefix = i - 1;
            var suffix = i + 1;
            sequence = 0;
            if (!set.contains(prefix)) {
                while (set.contains(suffix)) {
                    sequence++;
                    suffix = i + sequence;
                }
            }

            if (sequence > maxSequence) {
                maxSequence = sequence;
            }
        }

         if (maxSequence == 0) {
            maxSequence++;
        }

        return Math.max(maxSequence, 0);
    }
}
