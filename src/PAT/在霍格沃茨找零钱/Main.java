package PAT.在霍格沃茨找零钱;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		String[] str1 = sc.next().split("\\.");
		String []str2 = sc.next().split("\\.");
		int k = 0;
		int k2 = 0;
		int[] jin = new int[] {10000000,17,29};
		int [] res = new int[3];
		int [] res2 = new int[3];
		for(int i = str1.length-1; i >= 0; i--) {
			int bei = Integer.parseInt(str2[i])-k;
			int jian = Integer.parseInt(str1[i]);

			int bei2 = Integer.parseInt(str2[i]);
			int jian2 = Integer.parseInt(str1[i]) - k2;
			if(i!=0 && bei<jian) {
				k = 1;
				bei += jin[i];
			}else {
				k=0;
			}
			if(i!=0 && jian2<bei2) {
				k2 = 1;
				jian2 += jin[i];
			}else {
				k2=0;
			}
			res[i] = bei - jian;
			res2[i] = jian2 - bei2;
		}
		if (res[0] >= 0){
			System.out.println(res[0]+"."+res[1]+"."+res[2]);
		}else{
			System.out.println(-res2[0]+"."+res2[1]+"."+res2[2]);
		}

	}

}
