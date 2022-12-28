package PAT.输出PATest;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Map<Character,Integer> map = new HashMap<>();
		char[] cc = new char[] {'P', 'A', 'T', 'e', 's', 't'};
		int  sum = 0;
		for(int i=0;i<str.length();i++) {
			char tmp = str.charAt(i);
			if(tmp=='P'||tmp=='A'||tmp=='T'||tmp=='e'||tmp=='s'||tmp=='t') {
				sum++;
				map.put(tmp, map.getOrDefault(tmp, 0)+1);
			}
		}
		int i = 0;
		while(sum != 0) {
			if(map.getOrDefault(cc[(i % 6)], 0) != 0 ) {
				sum--;
				map.put(cc[(i % 6)], map.getOrDefault(cc[(i % 6)], 0)-1);
				System.out.print(cc[(i % 6)]);
			}
			i++;
		}
	}

}
