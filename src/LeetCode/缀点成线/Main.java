package LeetCode.缀点成线;

/**
 * @author lingqu
 * @date 2022/3/24
 * @apiNote
 */
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        double k;
        if(coordinates[0][0]-coordinates[1][0] != 0){
            k = (coordinates[0][1]-coordinates[1][1])/(coordinates[0][0]-coordinates[1][0]);
        }else{
            k = 0;
        }
        if (k == 0){
            for(int i = 2; i < coordinates.length; i++){
                if(coordinates[i][0] != coordinates[0][0]){
                    return false;
                }
            }
            return true;
        }
        double b = coordinates[0][1] - (k * coordinates[0][0]);
        for(int i = 2; i < coordinates.length; i++){
            if(coordinates[i][0] * k + b != coordinates[i][1]){
                return false;
            }
        }
        return true;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.checkStraightLine(new int[][]{{0, 0}, {0, 1}, {0, -1}}));
    }
}
