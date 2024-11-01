/*
 * @lc app=leetcode.cn id=852 lang=java
 *
 * [852] 山脉数组的峰顶索引
 */

// @lc code=start
class Solution
{
    public int find(int[] arr, int left, int right)
    {
        int mid = (left + right) / 2;
        if (left == right) return mid;
        else if (right == left + 1)
        {
            if (arr[mid] > arr[mid + 1]) return left;
            else return right;
        }
        else if (arr[mid] > arr[mid + 1]) return find(arr, left, mid);
        else return find(arr, mid, right);
        //else return -1;
    }
    public int peakIndexInMountainArray(int[] arr)
    {
        return find(arr, 1, arr.length - 2);
    }
}
// @lc code=end

