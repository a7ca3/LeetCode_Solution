/*
 * @lc app=leetcode.cn id=1534 lang=java
 *
 * [1534] 统计好三元组
 */

// @lc code=start
class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int i;
        int j;
        int k;
        int sum;
        sum = 0;

        for (i = 0; i < arr.length; i++)
            for (j = i + 1; j < arr.length; j++)
                for (k = j + 1; k < arr.length; k++)
                {
                    if (Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c)
                        sum++;

                }

        return sum;
    }
}
// @lc code=end

