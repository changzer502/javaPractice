package LeetCode.在圆内随机生成点;

/**
 * @author lingqu
 * @date 2022/6/5
 * @apiNote
 */
public class Main {
}

class Solution {
    double myRadius;
    double myX;
    double myY;
    public Solution(double radius, double x_center, double y_center) {
        myRadius = radius;
        myX = x_center;
        myY = y_center;
    }

    public double[] randPoint() {
        double[] res = new double[2];
        double d = Math.sqrt(Math.pow(myX,2) + Math.pow(myY,2));
        res[0] = Math.random()*(myRadius-myX) + d;
        return null;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(radius, x_center, y_center);
 * double[] param_1 = obj.randPoint();
 */
