package LeetCode.剑指OfferII二进制加法;

/**
 * @author changzer
 * @date 2023/2/22
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {

    }
}
class Solution {
    public String addBinary(String a, String b) {
        int indexA = a.length()-1;
        int indexB = b.length()-1;
        int jinwei = 0;
        StringBuilder sb = new StringBuilder();
        while(indexA >= 0 && indexB >= 0){
            int aa = a.charAt(indexA) - '0';
            int bb = b.charAt(indexB) - '0';
            sb.insert(0,(aa+bb+jinwei)%2);
            jinwei = (aa+bb+jinwei)/2;
            indexA--;
            indexB--;
        }
        while(indexA >= 0){
            int aa = a.charAt(indexA) - '0';
            sb.insert(0,(aa+jinwei)%2);
            jinwei = (aa + jinwei)/2;
            indexA--;
        }
        while(indexB >= 0){
            int aa = b.charAt(indexB) - '0';
            sb.insert(0,(aa+jinwei)%2);
            jinwei = (aa + jinwei)/2;
            indexB--;
        }
        while (jinwei != 0){
            sb.insert(0,(jinwei)%2);
            jinwei = (jinwei)/2;
            jinwei-=(jinwei)%2;
        }
        return sb.toString();
    }
}
