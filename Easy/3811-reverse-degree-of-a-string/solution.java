// Problem: 3811. Reverse Degree of a String
// Difficulty: Easy
// Language: Java
// Link: https://leetcode.com/problems/reverse-degree-of-a-string/

class Solution {
    public int reverseDegree(String s) {
       int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = 'z' - s.charAt(i) + 1;
            ans += value * (i + 1);
        }
        return ans; 
    }
}