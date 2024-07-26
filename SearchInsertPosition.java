class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }
        public static void main(String args[]){
            int nums[] = {1,3,5,6};
            int target=5;

            SearchInsertPosition s = new SearchInsertPosition();
            s.searchInsert(nums,5);
            System.out.println("The target is at " + nums + "index" );
    }
}