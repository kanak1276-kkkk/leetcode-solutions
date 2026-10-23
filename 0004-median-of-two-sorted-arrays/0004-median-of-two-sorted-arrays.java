class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] a = new int[m + n];

        int i = 0, j = 0, k = 0;

        while (i < m) {
            a[k++] = nums1[i++];
        }

        while (j < n) {
            a[k++] = nums2[j++];
        }

        java.util.Arrays.sort(a);

        int len = a.length;

        if (len % 2 == 1) {
            return a[len / 2];
        } else {
            return (a[len / 2 - 1] + a[len / 2]) / 2.0;
        }
    }
}

