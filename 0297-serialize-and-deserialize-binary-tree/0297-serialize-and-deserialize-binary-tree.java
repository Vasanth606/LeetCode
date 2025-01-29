/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "#";
        StringBuilder res = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr == null) res.append("#,");
            else{
                res.append(curr.val).append(",");
                q.offer(curr.left);
                q.offer(curr.right);
            }

        }
        res.deleteCharAt(res.length() - 1);
        System.out.print(res.toString());
        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == null || data.length() == 0) return null;
        Queue<TreeNode> q = new LinkedList<>();
        String[] nodes = data.split(",");
        TreeNode root = nodes[0].equals("#") ? null : new TreeNode(Integer.parseInt(nodes[0]));
        q.add(root);
        for(int i = 1; i < nodes.length; i++){
            TreeNode parent = q.poll(); //50
            if(!nodes[i].equals("#")){
                TreeNode left = new TreeNode(Integer.parseInt(nodes[i]));
                parent.left = left;
                q.offer(left) ;
            }
            if(!nodes[++i].equals("#")){
                TreeNode right = new TreeNode(Integer.parseInt(nodes[i]));
                parent.right = right;
                q.offer(right);
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;