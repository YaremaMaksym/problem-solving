package org.xsakon.leetcode;

import java.lang.reflect.Array;
import java.util.*;

public class P4MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;
        int[] nums3 = new int[n];

        int i = 0, j = 0, k = 0;

        while (i <= n1 && j <= n2) {

            if (i == n1) {
                while (j < n2) nums3[k++] = nums2[j++];
                break;
            } else if (j == n2) {
                while (i < n1) nums3[k++] = nums1[i++];
                break;
            }

            if (nums1[i] < nums2[j]) {
                nums3[k++] = nums1[i++];
            } else {
                nums3[k++] = nums2[j++];
            }

        }

        if (n % 2 == 0) {
            return (double) (nums3[n / 2 - 1] + nums3[n / 2]) / 2;
        } else {
            return nums3[n / 2];
        }
    }
}
