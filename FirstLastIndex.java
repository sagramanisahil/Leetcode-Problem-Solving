public class FirstLastIndex{
    
    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        
        result[0] = findStartingIndex(nums, target);
        result[1] = findEndingIndex(nums, target);
        
        return result;
    }
    
    private static int findStartingIndex(int[] nums, int target) {
        int index = -1;
        int left = 0, right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            
            if (nums[mid] == target) {
                index = mid;
            }
        }
        
        return index;
    }
    
    private static int findEndingIndex(int[] nums, int target) {
        int index = -1;
        int left = 0, right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            
            if (nums[mid] == target) {
                index = mid;
            }
        }
        
        return index;
    }
    
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = searchRange(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}

