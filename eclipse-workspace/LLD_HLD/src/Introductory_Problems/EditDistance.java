package Introductory_Problems;
import java.util.*;
public class EditDistance {
	static int MAXSIZE = 5001;

	static int dp[][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		int n = str1.length();
		int m = str2.length();
		dp = new int[n + 1][m + 1];
		for(int i = 0; i <= n; i++) {
			for(int j = 0; j <= m; j++) {
				if( i == 0) {
					dp[i][j] = j;
				}else if(j == 0) {
					dp[i][j] = i;
				}else if( str1.charAt(i -1) == str2.charAt(j - 1)) {
					dp[i][j] = dp[i -1][j - 1];
				}else {
					dp[i][j] = 1 + Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1]));
				}
			}
		}
		System.out.println(dp[n][m]);
	}
}
/*
LOVE
MOVIE
*/

