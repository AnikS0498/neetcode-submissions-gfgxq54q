class Solution {
    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i=0;i<len;i++)
        {
            queue.add(nums[i]);
            if(queue.size() > k){
                queue.poll();
            }
        }


        return queue.poll();
    }
}
