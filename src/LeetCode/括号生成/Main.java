package LeetCode.括号生成;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lingqu
 * @date 2022/3/24
 * @apiNote
 */
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        getAll(res, 0, new char[n*2]);
        return res;
    }
    void getAll(List<String> res, int index, char[] cc){
        if(index == cc.length){
            if(ok(cc)){
                res.add(new String(cc));
            }
        }
        cc[index] = '(';
        getAll(res, index+1, cc);
        cc[index] = ')';
        getAll(res, index+1, cc);

    }
    boolean ok(char[] cc){
        int b = 0;
        for(int i = 0; i < cc.length; i++){
            if(cc[i] == '('){
                b++;
            }
            if(cc[i] == ')'){
                b--;
            }
            if(b < 0){
                return false;
            }
        }
        return true;
    }
}
public class Main {
}
