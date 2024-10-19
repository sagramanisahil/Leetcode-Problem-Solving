class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        int result = 0;

        if(root != null){
            if(isLeaf(root.left)){
                result += root.left.val;
            }
            else{
                result += sumOfLeftLeaves(root.left);
            }
            result+= sumOfLeftLeaves(root.right);
        }
        return result;
    }
        public boolean isLeaf(TreeNode root){
            if(root == null){
                return false;
            }
            if(root.left == null && root.right == null){
                return true;
            }
            return false;
        }
}