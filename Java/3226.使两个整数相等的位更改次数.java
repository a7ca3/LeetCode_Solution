/*
 * @lc app=leetcode.cn id=3226 lang=java
 *
 * [3226] 使两个整数相等的位更改次数
 */

// @lc code=start
class Solution {
    public int minChanges(int n, int k) {
        int i, j;
        int sum = 0;
        while (n != 0)
        {
            i = n % 2;
            j = k % 2;
            if (i == 0 && j == 1) return -1;
            if (i == 1 && j == 0) sum++;
            n /= 2;
            k /= 2;
        }
        if (k != 0) return -1;
        else return sum;
    }
}
// @lc code=end

