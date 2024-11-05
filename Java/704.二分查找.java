/*
 * @lc app=leetcode.cn id=704 lang=java
 *
 * [704] 二分查找
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int left, right, mid;
        left = 0;
        right = nums.length - 1;
        mid = (left + right) / 2;
        while (left <= right)
        {
            if (nums[mid] < target) left = mid + 1;
            else if (nums[mid] > target) right = mid - 1;
            else if (nums[mid] == target) return mid;
            mid = (left + right) / 2;
        }
        return -1;
    }
}
// @lc code=end

