package Introductory_Problems;
import java.util.*;
public class TwoSetsII {
	static int MOD = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int totalSum = (n * (n + 1))/2;
		if(totalSum % 2 == 1) {
			System.out.println(0);
			return;
		}
		totalSum /= 2;
		long dp[] = new long[totalSum + 1];
		dp[0] = 1;
		for(int i = 1; i < n; i++) {
			for(int j = totalSum; j >= i; j--) {
				dp[j] = (dp[j] + dp[j - i] ) % MOD;
			}
		}
		System.out.println((dp[totalSum]) % MOD);
	}
}
