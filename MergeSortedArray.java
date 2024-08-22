public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = m - 1;
        int ptr2 = n - 1; 
        int mergedPtr = m + n - 1;
        
        while (ptr1 >= 0 && ptr2 >= 0) {
            if (nums1[ptr1] > nums2[ptr2]) {
                nums1[mergedPtr--] = nums1[ptr1--];
            } else {
                nums1[mergedPtr--] = nums2[ptr2--];
            }
        }
        
        while (ptr2 >= 0) {
            nums1[mergedPtr--] = nums2[ptr2--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

       MergeSortedArray solution = new MergeSortedArray();
        solution.merge(nums1, m, nums2, n);

        System.out.println("Output: " + java.util.Arrays.toString(nums1));
    }
}

		//Efficient Way to Solve Merge Sorted Array
class Main {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int arr1[] = {3, 4, 5, 6, 7, 8, 9};
        int mergedArray[] = new int[arr.length + arr1.length];

        int i = 0, j = 0;

        for (int k = 0; k < mergedArray.length; k++) {
            if (i < arr.length && (j >= arr1.length || arr[i] <= arr1[j])) {
                mergedArray[k] = arr[i++];
            } else {
                mergedArray[k] = arr1[j++];
            }
        }

        for (int x = 0; x < mergedArray.length; x++) {
            System.out.print(mergedArray[x] + " ");
        }
    }
}
