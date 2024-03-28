package Introductory_Problems;
import java.util.*;
public class RemovalGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long totalSum = 0;
		int nums[] = new int[n];
		long dp[][] = new long[n][n];
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
			dp[i][i] = nums[i];
			totalSum += nums[i];
		}
		for(int left = n - 1; left >= 0; left--) {
			for(int right = left + 1; right < n; right++) {
				long firstSelected = nums[left] - dp[left + 1][right];
				long lastSelected = nums[right] - dp[left][right - 1];
				dp[left][right] = Math.max(firstSelected, lastSelected);
			}
		}
		System.out.println((totalSum + dp[0][n - 1]) / 2);
		}
}
