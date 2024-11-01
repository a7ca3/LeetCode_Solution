/*
 * @lc app=leetcode.cn id=1422 lang=java
 *
 * [1422] 分割字符串的最大得分
 */

// @lc code=start
class Solution {
    public int maxScore(String s) {
        char[] arr = s.toCharArray();
        int max;
        int score;
        int i, j;
        max = 0;
        for (i = 1; i < s.length(); i++)
        {
            score = 0;
            for (j = 0; j < i; j++)
                if (arr[j] == '0') score++;
            for (j = i; j < s.length(); j++)
                if (arr[j] == '1') score++;
            
            if (score > max) max = score;
        }
        return max;
    }
}
// @lc code=end

