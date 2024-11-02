class InsertIntoBinaryTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val);
        if (root == null) {
            root = newNode;
        } else {
            TreeNode current = root;
            TreeNode parent = null;
            while (current != null) {
                parent = current;
                if (val < current.val) {
                    current = current.left;
                } else if (val > current.val) {
                    current = current.right;
                } else {
                    return root;
                }
            }
            if (val < parent.val) {
                parent.left = newNode;
            } else {
                parent.right = newNode;
            }
        }
        return root;
    }
}