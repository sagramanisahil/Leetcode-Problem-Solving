class LevelOrderTraversal{
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        function(root, 0, list);
        return list;
    }

    public static void function(TreeNode root, int level, List<List<Integer>> list) {
        if (root == null) {
            return;
        }
        if (list.size() == level) {
            list.add(new ArrayList<>());
        }
        list.get(level).add(root.val);
        function(root.left, level + 1, list);
        function(root.right, level + 1, list);
    }
}
