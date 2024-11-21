/*
 * @lc app=leetcode.cn id=3248 lang=java
 *
 * [3248] 矩阵中的蛇
 */

// @lc code=start
class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int posX;
        int posY;
        posX = 0;
        posY = 0;

        for (String command : commands) {
            if (command.equals("UP")) posY -= 1;
            if (command.equals("DOWN")) posY += 1;
            if (command.equals("LEFT")) posX -= 1;
            if (command.equals("RIGHT")) posX += 1;
        }

        return posY * n + posX;
    }
}
// @lc code=end

