class Solution {
    public int maxArea(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int area = Integer.MIN_VALUE;

        while(left < right){
            area = Math.max(area, (right - left) * Math.min(arr[right], arr[left]));

            if (arr[left] <= arr[right])
                left++;
            else if (arr[right] < arr[left])
                right--;
        }

        return Math.max(area, 0);
    }
}
