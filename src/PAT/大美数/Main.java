package PAT.大美数;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =0;i<n;i++) {
			int num = sc.nextInt();
			if(isDaMei(num)) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
	public static boolean isDaMei(int num) {
		Set<Integer> set = new HashSet<>();
		for(int i=1;i*i<=num;i++) {
			if(num%i==0) {
				set.add(i);
				set.add(num/i);
			}
		}
		List<Integer> list = new ArrayList<>(set);
		Collections.sort(list);
		if(list.size() < 4){
			return false;
		}

		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				for(int k=j+1;k<list.size();k++) {
					for(int l=k+1;l<list.size();l++) {
						int sum = list.get(i)+list.get(j)+list.get(k)+list.get(l);
						if(num%sum==0) return true;
					}
				}
			}
		}
		return false;
	}
}
