package PAT.平等的交易;


import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();

		Integer[] nums = new Integer[n];
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		Integer w = sc.nextInt();
		Arrays.sort(nums);

		//for(int i = n-1; i >= 0; i--) {
		//	if(nums[i] <= w) {
		//		w = nums[i];
		//		break;
		//	}
		//}
		int res = 0;
		for(int i = 0; i < n; i++) {
			if(nums[i] <= w) {
				w -= nums[i];
				res++;
			}
		}
		System.out.print(res);

	}

}
