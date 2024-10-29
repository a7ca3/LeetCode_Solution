/*
 * @lc app=leetcode.cn id=326 lang=java
 *
 * [326] 3 的幂
 */

// @lc code=start
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n == 1) return true;
        else if (n == 0) return false;
        else if (n % 3 != 0) return false;
        else return isPowerOfThree(n / 3);
    }
}
// @lc code=end

