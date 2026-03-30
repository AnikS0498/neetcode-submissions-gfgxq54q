class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int i : stones) {
            maxHeap.add(i);
        }

        while (maxHeap.size() > 1) {
            var first = maxHeap.poll();
            var second = maxHeap.poll();

            if (second > first) {
                var diff = second - first;
                maxHeap.add(diff);
            } else if (first > second) {
                var diff = first - second;
                maxHeap.add(diff);
            }
        }

        if (maxHeap.size() == 1)
            return maxHeap.poll();

        return 0;
    }
}
