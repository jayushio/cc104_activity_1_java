package org.cc104.solutions;
 // Linear search version
public class Problem2 {
    
    public int findMissingElementLinear(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

     // Binary search version
    public int findMissingElementBinary(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == mid + 1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left + 1;
    }
}
