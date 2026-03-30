class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int len = matrix.length;

        for(int i=0; i<len; i++){
            int l=0;
            int r = matrix[i].length - 1;
            while(l<=r){
                int m = (l+r)/2;
                if(matrix[i][m] == target)
                    return true;
                else if(target < matrix[i][m])
                    r = m-1;
                else
                    l = m+1;
            }
        }

    return false;

    }
}
