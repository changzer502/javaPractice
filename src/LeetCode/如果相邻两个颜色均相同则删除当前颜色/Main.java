package LeetCode.如果相邻两个颜色均相同则删除当前颜色;

/**
 * @author lingqu
 * @date 2022/3/22
 * @apiNote
 */
class Solution {
    public boolean winnerOfGame(String colors) {
        int alice = 0;
        int bob = 0;
        int aconnect = 0;
        int bconnect = 0;
        for(int i = 0; i<colors.length(); i++){
            if('A'==colors.charAt(i)){
                aconnect++;
            }else{
                aconnect = 0;
            }
            if('B'== colors.charAt(i)){
                bconnect++;
            }else{
                bconnect = 0;
            }
            if(aconnect > 2){
                alice++;
            }
            if(bconnect > 2){
                bob++;
            }
        }
        return alice>=bob;
    }
}
public class Main {
}
