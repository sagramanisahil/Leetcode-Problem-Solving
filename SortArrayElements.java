//Using Bubble Sort 
// Time Complexity: O(n^2)
//Space Complexity: O(1)

import java.util.Arrays;
class SortArrayElements {
    public static int[] sortArray(int[] nums) {
        int temp=0;
        for(int i =0; i < nums.length-1; i++){
            for(int j=0; j < nums.length-i-1; j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j]= nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;
    }
    public static void main(String args[]){
        int nums[] = {5,2,3,1};
        
        System.out.print(Arrays.toString(sortArray(nums)));
    }
}


// Insertion Sort
Best case: O(n)
Worst Case: O(n^2)

import java.util.Arrays;

class SortArrayElements {
    public static int[] sortArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = key;
        }
        return nums;
    }

    public static void main(String[] args) {
        int nums[] = {5, 2, 3, 1};
        System.out.println(Arrays.toString(sortArray(nums)));
    }
}



//Most Efficient Solution
// Time Complexity: O(nlogn)
//Space Complexity: O(n)

import java.util.Arrays;

class SortArrayElements  {
    public static int[] sortArray(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        
        int mid = nums.length / 2;
        int[] left = Arrays.copyOfRange(nums, 0, mid);
        int[] right = Arrays.copyOfRange(nums, mid, nums.length);
        
        return merge(sortArray(left), sortArray(right));
    }
    
    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        
        while (i < left.length) {
            result[k++] = left[i++];
        }
        
        while (j < right.length) {
            result[k++] = right[j++];
        }
        
        return result;
    }

    public static void main(String[] args) {
        int nums[] = {5, 2, 3, 1};
        System.out.print(Arrays.toString(sortArray(nums)));
    }
}

