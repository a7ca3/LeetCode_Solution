/*
 * @lc app=leetcode.cn id=867 lang=java
 *
 * [867] 转置矩阵
 */

// @lc code=start
class Solution {
    public int[][] transpose(int[][] matrix) {
        int m, n;
        int i, j;
        m = matrix.length; //line
        n = matrix[0].length; //column
        int[][] transposed = new int[n][m];
        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++)
            {
                transposed[j][i] = matrix[i][j];
            }
        return transposed;
    }
}
// @lc code=end

