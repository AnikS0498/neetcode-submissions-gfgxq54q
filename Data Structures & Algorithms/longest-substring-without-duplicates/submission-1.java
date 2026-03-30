class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int len = s.length();
        int maxLen = Integer.MIN_VALUE;

        HashSet<Character> set = new HashSet<>();

        while (right < len) {
            var ch = s.charAt(right);

            if (!set.contains(ch)) {
                set.add(ch);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }

            var diff = right - left;
            if (diff > maxLen) {
                maxLen = diff;
            }
        }

        return Math.max(maxLen, 0);
    }
}
