package Introductory_Problems;
import java.util.*;
public class GridPathsDP {

	static int MAXSIZE = 1001;
	static int MOD = 1000000007;
	static int dp[][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dp = new int[n + 1][n + 1];
		for(int i = 1; i <= n; i++) {
			String str = sc.next();
			for(int j = 1; j <= n; j++) {
				char ch = str.charAt(j - 1);
				if(ch == '.') {
					if(i == 1 && j == 1) {
						dp[i][j] = 1;
					}else {
						dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % MOD;
					}
				}
			}
		}
		System.out.println(dp[n][n]);
	}
}

/*
 4
. . . .
. * . .
. . . *
* . . .
* 4
....
.*..
...*
*...
*/