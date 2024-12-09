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
class SecondMinimumNode{
    long fMin = Long.MAX_VALUE;
    long sMin = Long.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
        find(root);
        if(sMin == Long.MAX_VALUE){
            return -1;
        }
        int answer = (int) sMin;
        return answer;
    }
    public void find(TreeNode root){
        if(root == null){
            return;
        }
        if(root.val < fMin){
            sMin = fMin;
            fMin = root.val;
        } else if(root.val != fMin && root.val < sMin){
            sMin = root.val;
        }
        find(root.left);
        find(root.right);
    }
}