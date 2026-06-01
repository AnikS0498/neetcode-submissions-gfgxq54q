class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] res = new int[k][2];
        int rows = points.length;
        // creating a maxHeap
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> b[0] - a[0]);

        for(int i=0;i<rows;i++){
            int x = points[i][0];
            int y = points[i][1];

            int dist = (x * x) + (y * y);
            maxHeap.add(new int[]{
                dist,
                i
            });

            if(maxHeap.size() > k){
                maxHeap.poll();
            }            
        }

        for(int i=0;i<k;i++){
            int[] n = maxHeap.poll();
            res[i][0] = points[n[1]][0];
            res[i][1] = points[n[1]][1];
        }

        return res;

    }
}
