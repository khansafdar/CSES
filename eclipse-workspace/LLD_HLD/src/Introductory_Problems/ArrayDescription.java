package Introductory_Problems;
import java.util.*;
public class ArrayDescription {

	static int MOD = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int nums[] = new int[n];
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		int dp[][] = new int[n][m + 1];
		if(nums[0] != 0) {
			dp[0][nums[0]] = 1;
		}else {
			for(int i = 1; i <= m; i++) {
				dp[0][i] = 1;
			}
		}
		for(int i = 1; i < n; i++) {
			if(nums[i] != 0) {
				if(nums[i] - 1 >= 1)
					dp[i][nums[i]] = (dp[i][nums[i]] + dp[i - 1][nums[i] - 1]) % MOD;
				dp[i][nums[i]] = (dp[i][nums[i]] + dp[i - 1][nums[i]]) % MOD;
				if(nums[i] + 1 <= m) 
					dp[i][nums[i]] = (dp[i][nums[i]] + dp[i - 1][nums[i] + 1]) % MOD;
			}else {
				for(int j = 1; j <= m; j++) {
					if(j - 1 >= 1)
						dp[i][j] = (dp[i][j] + dp[i - 1][j - 1]) % MOD;
					dp[i][j] = (dp[i][j] + dp[i - 1][j]) % MOD;
					if(j + 1 <= m) 
						dp[i][j] = (dp[i][j] + dp[i - 1][j + 1]) % MOD;
				}
			}
			
		}
		int totalCount = 0;
		for(int i = 1; i <= m; i++) {
			totalCount = (totalCount + dp[n - 1][i]) % MOD;
		}
		System.out.println(totalCount);

	}

}
