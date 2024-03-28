package Introductory_Problems;
import java.util.*;
public class RectangleCutting {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int dp[][] = new int[n + 1][m + 1];
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				if(i == j)dp[i][j] = 0;
				else {
					int min = Integer.MAX_VALUE;
					for(int h = 1; h < i; h++) {
						min = Math.min(min , dp[h][j] + dp[i - h][j]);
					}
					for(int v = 1; v < j; v++) {
						min = Math.min(min , dp[i][v] + dp[i][j - v]);
					}
					dp[i][j] = 1 + min;
				}
			}
		}
//		for(int i = 1; i <= n; i++) {
//			for(int j = 1; j <= m; j++) {
//				System.out.print(dp[i][j] +" ");
//			}
//			System.out.println();
//		}
		System.out.println(dp[n][m]);
	}
}
