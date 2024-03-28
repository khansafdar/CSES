package Introductory_Problems;
import java.util.*;
public class RemovingDigits {
	static int MAXSIZE = 1000001;
	static int INF = 100000000;
	static int dp[] = new int[MAXSIZE];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Arrays.fill(dp, INF);
		dp[n] = 0;
		solve(n);
		System.out.println(dp[0]);
//		for(int i = 0; i  < n;i++ )System.out.println(dp[i]);
	}
	public static void solve(int n) {
		for(int i = n; i > 0; i--) {
			int x = i;
			while(x > 0) {
				int d = x % 10;
				dp[i - d] = Math.min(dp[i - d], dp[i] + 1);
				x /= 10;
			}
		}
	}
}




