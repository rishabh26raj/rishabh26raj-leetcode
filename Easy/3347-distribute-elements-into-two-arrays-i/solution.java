// Problem: 3347. Distribute Elements Into Two Arrays I
// Difficulty: Easy
// Language: Java
// Link: https://leetcode.com/problems/distribute-elements-into-two-arrays-i/

class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int n1 = 0;
        int n2 = 0;
        arr1[n1++] = nums[0];
        arr2[n2++] = nums[1];
        for (int i = 2; i < n; i++) {
            if (arr1[n1 - 1] > arr2[n2 - 1]) {
                arr1[n1++] = nums[i];
            } else {
                arr2[n2++] = nums[i];
            }
        }
        int[] ans = new int[n];
        int index = 0;
        for (int i = 0; i < n1; i++) {
            ans[index++] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            ans[index++] = arr2[i];
        }
        return ans;
    }
}