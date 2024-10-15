class ConvertSortedToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        return func(nums, start, end);
    }
    public TreeNode func(int[] nums, int start, int end){
        if(start > end){
            return null;
        }
        int mid = start+(end-start)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = func(nums, start, mid-1);
        root.right= func(nums,mid+1, end);
        return root;
    }
}