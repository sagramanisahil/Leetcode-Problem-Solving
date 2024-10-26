class UniValuedTree{
    public boolean isUnivalTree(TreeNode root) {
        int rootValue = root.val;
        return checkTree(root,rootValue);
    }
    public boolean checkTree(TreeNode root, int val){
        if(root == null){
            return true;
        }
        if(root.val != val){
            return false;
        }
        return checkTree(root.left,val) && checkTree(root.right,val);
    }
}