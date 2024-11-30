/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int num;
        for (int i = 0; i < nums.length; i++)
        {
            num = target - nums[i];
            for (int j = i + 1; j < nums.length; j++)
            {
                if (nums[j] == num)
                {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
}
// @lc code=end

