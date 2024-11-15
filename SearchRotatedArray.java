class SearchRotatedArray {
    public int search(int[] nums, int target) {
        int s=0;
        int e = nums.length-1;

        while(s <= e){
            int mid = s + (e-s)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] <= nums[e]){
                if(target > nums[mid] && target <= nums[e]){
                    s = mid + 1;
                }
                else{
                    e = mid - 1;
                }
            }
            else{
                if(target >= nums[s] && target < nums[mid]){
                    e = mid - 1;
                }
                else{
                    s = mid + 1;
                }
            }
        }
        return -1;
    }
}

 // for(int i=0; i<nums.length; i++){
        //     if(nums[i] == target){
        //         return i;
        //     }
        // }
        // return -1;




/*class SearchRotatedArray {
    public int search(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}*/