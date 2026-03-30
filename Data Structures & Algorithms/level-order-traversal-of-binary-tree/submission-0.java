/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();

            for(int i=queue.size();i>0;i--){
                var poppedData = queue.poll();
                if(poppedData != null){
                    level.add(poppedData.val);
                    if(poppedData.left != null)
                        queue.add(poppedData.left);
                    if(poppedData.right != null)
                        queue.add(poppedData.right);
                }
            }

            if(level.size() > 0)
                res.add(level);
        }

        return res;

    }
}
