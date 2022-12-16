package PAT.检测密码;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		sc.nextLine();

		for(int i =0;i<n;i++) {
			boolean allRight = false;
			boolean noChar = false;
			boolean noNum =false;
			boolean unknow = false;

			String str = sc.nextLine();
			int len = str.length();
			char[] ch = str.toCharArray();

			if(len<6) {
				allRight = true;
				System.out.println("Your password is tai duan le.");
				continue;
			}
			for(int j=0;j<len;j++) {

				if((ch[j]>='a'&&ch[j]<='z') || (ch[j]>='A'&&ch[j]<='Z')) {
					noChar = true;
				}else if((ch[j]>='0'&&ch[j]<='9')) {
					noNum = true;
				}else if(ch[j]=='.') {
					continue;
				}else {
					unknow = true;
					allRight = true;
					System.out.println("Your password is tai luan le.");
					break;
				}

			}
			if(unknow) {
				continue;
			}

			if(!noChar) {
				allRight = true;
				System.out.println("Your password needs zi mu.");
				continue;
			}else if(!noNum) {
				allRight = true;
				System.out.println("Your password needs shu zi.");
			}
			if(!allRight) {
				System.out.println("Your password is wan mei.");
			}
		}

	}
}
