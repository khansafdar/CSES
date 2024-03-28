package Introductory_Problems;
import java.util.*;
public class CountingTowers {
	static int MAXSIZE = 1000001;
	static int MOD = 1000000007;
	static int dp[] = new int[MAXSIZE];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			if(n == 1) {
				System.out.println(2);
				continue;
			}
			long dp[][] = new long[n + 2][2];
			dp[n +1][0] = dp[n + 1][1] = 1;
			for(int i = n; i >= 2; i--) {
				long op1 = (dp[i + 1][0] + dp[i + 1][1]) % MOD;
				long op2 = (dp[i + 1][0] ) % MOD;
				long op3 = (2 * dp[i + 1][0] ) % MOD;
				long op4 = (dp[i + 1][1] ) % MOD;
				dp[i][0] = (op1 + op2 + op3) % MOD;
				dp[i][1] = (op1 + op4) % MOD;
			}
			System.out.println( (dp[2][0] + dp[2][1]) % MOD);
		}
	}
}
