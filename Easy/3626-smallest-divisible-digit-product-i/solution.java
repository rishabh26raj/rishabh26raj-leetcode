// Problem: 3626. Smallest Divisible Digit Product I
// Difficulty: Easy
// Language: Java
// Link: https://leetcode.com/problems/smallest-divisible-digit-product-i/

class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            if (digitProduct(n) % t == 0) {
                return n;
            }
            n++;
        }
    }
    private int digitProduct(int num) {
        int product = 1;
        while (num > 0) {
            product *= num % 10;
            num /= 10;
        }
        return product;
    }
}