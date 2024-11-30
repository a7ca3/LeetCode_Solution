/*
 * @lc app=leetcode.cn id=3232 lang=java
 *
 * [3232] 判断是否可以赢得数字游戏
 */

// @lc code=start
class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum1;
        int sum2;
        sum1 = 0;
        sum2 = 0;
        for (int num : nums)
        {
            if (num / 10 == 0) sum1 += num;
            else sum2 += num;
        }
        if (sum1 == sum2) return false;
        else return true;
    }
}
// @lc code=end

