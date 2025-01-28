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
    public boolean calculatePath(TreeNode root,int curr,int t){
        if(root == null) return false;
        int sum = root.val + curr; 
        if(sum == t && root.left == null && root.right == null) return true;
        return calculatePath(root.left,sum,t) || calculatePath(root.right,sum,t);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return calculatePath(root,0,targetSum);
    }
}