package array;

public class merged_array {
    public static  void main(String[] args) {
        int[] nums1={1,2,3,0,0};
          int[] nums2={2,5,6};
         int m = nums1.length;
         int n= nums2.length;


        int i = m - 1; // Index for nums1 (the actual nums)
        int j = n - 1; // Index for nums2
        int k = m + n - 1; // Index for nums1 (the next filled position)

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
        }
    }
}
