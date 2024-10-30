/*
 * @lc app=leetcode.cn id=3216 lang=java
 *
 * [3216] 交换后字典序最小的字符串
 */

// @lc code=start
class Solution {
    public String getSmallestString(String s) {
        char[] arr = s.toCharArray();
        int i;
        char temp;
        for (i = 0; i < arr.length - 1; i++)
            if (arr[i] % 2 == arr[i+1] % 2 && arr[i] > arr[i+1])
            {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                break; 
            }
        return new String(arr);
    }
}
// @lc code=end

