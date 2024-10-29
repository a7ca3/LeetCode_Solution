/*
 * @lc app=leetcode.cn id=1486 lang=java
 *
 * [1486] 数组异或操作
 */

// @lc code=start
class Solution {
    public int xorOperation(int n, int start) {
        int xor;
        int i;
        xor = start;
        for (i = 1; i < n; i++)
        {
            xor ^= start + 2 * i;
        }
        return xor;
    }
}
// @lc code=end

