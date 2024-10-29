/*
 * @lc app=leetcode.cn id=231 lang=java
 *
 * [231] 2 的幂
 */

// @lc code=start
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        else if (n == 0) return false;
        else if (n % 2 != 0) return false;
        else return isPowerOfTwo(n / 2);
    }
}
// @lc code=end

