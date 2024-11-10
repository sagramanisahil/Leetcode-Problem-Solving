class BinaryTreeTilt {
    int sum = 0;
    public int findTilt(TreeNode root) {
        if(root == null){
            return 0;
        }
        find(root);
        return sum;
    }

    public int find(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = find(root.left);
        int right = find(root.right);
        sum += Math.abs(left - right);
        return left + right + root.val;
    }
}