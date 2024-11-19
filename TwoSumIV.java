class TwoSumIV {
    public boolean findTarget(TreeNode root, int k) {
        return dfs(root, k , root);
    }
    public boolean dfs(TreeNode node, int k, TreeNode root){
        if(node == null){
            return false;
        }
        if(search(root, k-node.val, node)){
            return true;
        }
        return dfs(node.left, k, root) || dfs(node.right,k, root);
    }
    public boolean search(TreeNode node, int target, TreeNode p){
        if(node == null){
            return false;
        }
        if(node.val == target && node != p){
            return true;
        }
        if(target > node.val){
            return search(node.right, target , p);
        }
        return search(node.left, target , p);
    }
}