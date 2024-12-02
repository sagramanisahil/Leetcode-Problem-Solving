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
class BinaryTreeCousins {
    boolean answer = false;
    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root, x, y, 0);
        return answer;
    }
    public int dfs(TreeNode root, int x, int y, int depth){
        if(root == null) return 0;
        int left = dfs(root.left, x, y, depth + 1);
        int right = dfs(root.right, x, y, depth + 1);

        if(left != 0 && right != 0 && left == right && left != depth + 1){
            answer = true;
        }

        if(left != 0){
            return left;
        }
        if(right != 0){
            return right;
        }
        if(root.val == x || root.val == y){
            return depth;
        }

        return 0;
    }
}