/*
 * @lc app=leetcode.cn id=2586 lang=java
 *
 * [2586] 统计范围内的元音字符串数
 */

// @lc code=start
class Solution
{
    public boolean ifVowel(char c)
    {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            return true;
        else return false;
    }
    public int vowelStrings(String[] words, int left, int right)
    {
        int i;
        int sum;
        sum = 0;
        for (i = left; i <= right; i++)
        {
            if (ifVowel(words[i].charAt(0)) && ifVowel(words[i].charAt(words[i].length() - 1)))
            sum++;
        }
        return sum;
    }
}
// @lc code=end

