/*
 * @lc app=leetcode.cn id=258 lang=java
 *
 * [258] 各位相加
 */

// @lc code=start
class Solution {
    public int addDigits(int num) {
        int sum;
        sum = 0;
        while (num != 0)
        {
            sum += num % 10;
            num /= 10;
        }
        if (sum / 10 != 0) return addDigits(sum);
        else return sum;
    }
}
// @lc code=end

