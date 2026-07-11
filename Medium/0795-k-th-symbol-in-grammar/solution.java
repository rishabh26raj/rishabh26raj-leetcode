// Problem: 795. K-th Symbol in Grammar
// Difficulty: Medium
// Language: Java
// Link: https://leetcode.com/problems/k-th-symbol-in-grammar/

class Solution {
    public int kthGrammar(int n, int k) {
        if (n == 1) {
            return 0;
        }

        int parent = kthGrammar(n - 1, (k + 1) / 2);

        if (k % 2 == 1) {
            return parent;     
        } else {
            return 1 - parent; 
        }
    }
}