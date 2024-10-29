/*
 * @lc app=leetcode.cn id=1512 lang=java
 *
 * [1512] 好数对的数目
 */

// @lc code=start
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int i;
        int j;
        int sum;
        sum = 0;
        for (i = 0; i < nums.length; i++)
            for (j = i + 1; j < nums.length; j++)
            {
                if (nums[i] == nums[j]) sum++;
            }
        return sum;
    }
}
// @lc code=end

