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
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        q.offer(root);
        while(!q.isEmpty()){
            int levelSize = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i = 0; i < levelSize; i++){
                TreeNode temp = q.poll(); 
                if(i == levelSize - 1) res.add(temp.val);
                level.add(temp.val);
                if(temp.left != null) q.offer(temp.left);
                if(temp.right != null) q.offer(temp.right);
            }
            ans.add(level);
        }
        return res;
    }
}