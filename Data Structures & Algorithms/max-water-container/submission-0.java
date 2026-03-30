class Solution {
    public int maxArea(int[] heights) {
        int result = Integer.MIN_VALUE;
        int len = heights.length;

        int i = 0;
        int j = len - 1;
        while (i < j) {
            var vol = (j - i) * Math.min(heights[i], heights[j]);

            if (vol > result) {
                result = vol;
            }

            if (heights[i] < heights[j]) {
                i++;
            } else
                j--;
        }

        return Math.max(result, 0);
    }
}
