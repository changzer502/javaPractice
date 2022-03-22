package LeetCode;

import java.util.Arrays;

/**
 * @author lingqu
 * @date 2021/12/11
 * @apiNote
 */
public class Max {
    public static void main(String[] args) {
        int[] arr = new int[]{2,1,3,3};
        arr = maxSubsequence(arr,2);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
    public static int[] maxSubsequence(int[] nums, int k) {
        if(nums.length <= 0) {
            return new int[0];
        }
        int[] temp = new int[nums.length];
        int[] id = new int[nums.length];
        System.arraycopy(nums ,0,temp,0,nums.length);
        for(int i = 0; i < nums.length; i++) {
            id[i] = i;
        }
        for(int i = 0; i < nums.length; i++) {
            int x = i;
            for(int j = i+1; j<nums.length; j++) {
                if(temp[j] > temp[x]) {
                    x = j;
                }
            }
            if(x!=i){
                int t = temp[x];
                temp[x] = temp[i];
                temp[i] = t;
                int idTemp = id[i];
                id[i] = id[x];
                id[x] = idTemp;
            }
        }
        int[] res = new int[k];
        int count = 0;
        int[] idRes = new int[k];
        System.arraycopy(id ,0,idRes,0,k);
        Arrays.sort(idRes);
        for(int i = 0; i < k; i++){
            res[i] =nums[idRes[i]];
        }
        return res;
    }
}
