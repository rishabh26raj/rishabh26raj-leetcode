// Problem: 1574. Maximum Product of Two Elements in an Array
// Difficulty: Easy
// Language: Java
// Link: https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/

class Solution {
    public int maxProduct(int[] nums) {
        // int n=nums.length;
        // Arrays.sort(nums);
        // return (nums[n-1]-1)*(nums[n-2]-1);

        int max1=0;
       int max2=0;
       for(int num:nums){
        if(num>max1){
            max2=max1;
            max1=num;
        }
        else if(num>max2){
            max2=num;
        }
       }
       return (max1 - 1)*(max2 -1);
        
    }
}
   