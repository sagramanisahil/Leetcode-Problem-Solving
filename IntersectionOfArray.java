class IntersectionOfArray {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i = 0;
        int j = 0;
        int[] intersection = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                if (index == 0 || intersection[index - 1] != nums1[i]) {
                    intersection[index++] = nums1[i];
                }
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }

        int[] result = new int[index];
        for (int k = 0; k < index; k++) {
            result[k] = intersection[k];
        }

        return result;
    }
}