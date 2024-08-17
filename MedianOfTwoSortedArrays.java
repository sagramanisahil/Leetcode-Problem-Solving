class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergeArr = merge(nums1,nums2);
        int length = mergeArr.length;
        double median =0;

        if(length % 2 == 0){
            median = ((mergeArr[length/2 - 1] + mergeArr[length/2])/2.0);
        }
        else{
            median = mergeArr[length/2];
        }
        return median;
    }

        public static int[] merge(int[] nums1, int[] nums2){
            int m = nums1.length;
            int n = nums2.length;
            int mergedArray[] = new int[m+n];

            int i=0, j=0, k=0;

            while(i<m && j<n){
                if(nums1[i] < nums2[j]){
                    mergedArray[k++] = nums1[i++];
                }
                else{
                    mergedArray[k++] = nums2[j++];
                }
            }
        
         while(i < m){
            mergedArray[k++] = nums1[i++];
        }
        while(j < n){
            mergedArray[k++] = nums2[j++];
        }
        return mergedArray;
    }
}