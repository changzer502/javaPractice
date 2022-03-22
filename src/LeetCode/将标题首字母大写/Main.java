package LeetCode.将标题首字母大写;

/**
 * @author lingqu
 * @date 2022/1/8
 * @apiNote
 */
class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();
        String[] str = title.split(" ");

        for (int i = 0; i < str.length; i++) {
            sb.append(" ");
            for (int j = 0; j < str[i].length(); j++) {
                if(str[i].length()>2 && j==0){
                    sb.append(Character.toUpperCase(str[i].charAt(j)));
                }else{
                    sb.append(Character.toLowerCase(str[i].charAt(j)));
                }
            }
        }
        return sb.toString().trim();
    }
}
public class Main {
    public static void main(String[] args) {

    }
}
