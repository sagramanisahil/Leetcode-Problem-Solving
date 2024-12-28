class BalanceBinaryTree {
    ArrayList<Integer> list = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return traverse(0, list.size()-1);
    }
    public void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    public TreeNode traverse(int start, int end){
        if(start == end){
            return new TreeNode(list.get(start));
        }
        if(start > end){
            return null;
        }
        int mid = start + (end - start)/2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = traverse(start, mid-1);
        root.right = traverse(mid+1, end);
        return root;
    }
}