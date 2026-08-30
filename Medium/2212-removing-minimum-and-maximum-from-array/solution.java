// Problem: 2212. Removing Minimum and Maximum From Array
// Difficulty: Medium
// Language: Java
// Link: https://leetcode.com/problems/removing-minimum-and-maximum-from-array/

class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        int left = Math.min(minIndex, maxIndex) + 1;
        int right = n - Math.max(minIndex, maxIndex);
        int bothLeft = Math.max(minIndex, maxIndex) + 1;
        int bothRight = n - Math.min(minIndex, maxIndex);
        int oneEach = left + right;
        return Math.min(
            Math.min(bothLeft, bothRight),oneEach);
    }
}