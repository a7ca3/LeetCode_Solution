/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 轮转数组
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        int[] subnums = Arrays.copyOfRange(nums, nums.length - k, nums.length);
        for (int i = nums.length - k - 1; i >= 0; i--)
        {
            nums[i + k] = nums[i];
        }
        for (int i = 0; i < subnums.length; i++)
        {
            nums[i] = subnums[i];
        }
    }
}
// @lc code=end

