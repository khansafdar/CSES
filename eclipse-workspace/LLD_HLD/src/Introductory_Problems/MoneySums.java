package Introductory_Problems;
import java.util.*;
public class MoneySums {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int[n];
		int m = 0;
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
			m += nums[i];
		}
		boolean dp[] = new boolean[m + 1];
		dp[0] = true;
		int count = 0;
		for(int i = 0; i < n; i++) {
			int x = nums[i];
			for(int j = m; j >= x; j--) {
				if(!dp[j] && dp[j - x]) {
					dp[j] = true;
					count += 1;
				}
			}
		}
		System.out.println(count);
		for(int i = 1; i <= m; i++) {
			if(dp[i])System.out.print(i +" ");
		}
	}
}
