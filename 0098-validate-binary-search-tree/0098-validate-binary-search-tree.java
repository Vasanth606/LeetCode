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
    public List<Integer> inOrder(TreeNode root, List<Integer> temp) {
        if (root == null) return temp;
        inOrder(root.left, temp);
        temp.add(root.val);
        inOrder(root.right, temp);
        return temp;
    }
    public boolean isValidBST(TreeNode root) {
        List<Integer> temp = new ArrayList<>();
        inOrder(root, temp);
        for (int i = 0; i < temp.size() - 1; i++) {
            if (temp.get(i) >= temp.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}