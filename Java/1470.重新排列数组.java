/*
 * @lc app=leetcode.cn id=1470 lang=java
 *
 * [1470] 重新排列数组
 */

// @lc code=start
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] orderedNums = new int[2 * n]; 
        int i;
        for (i = 0; i < n; i++)
        {
            orderedNums[2 * i] = nums[i];
            orderedNums[2 * i + 1] = nums[n + i];
        }
        return orderedNums;
    }
}
// @lc code=end

