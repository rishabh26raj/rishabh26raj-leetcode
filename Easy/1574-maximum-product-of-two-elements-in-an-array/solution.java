// Problem: 1574. Maximum Product of Two Elements in an Array
// Difficulty: Easy
// Language: Java
// Link: https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/

class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        return (nums[n-1]-1)*(nums[n-2]-1);
    }
}