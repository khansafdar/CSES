package Introductory_Problems;
import java.util.*;
public class BookShop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int w[] = new int[n];
		int p[] = new int[n];
		for(int i = 0; i < n; i++) { 
			w[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) { 
			p[i] = sc.nextInt();
		}
		int dp[] = new int[x + 1];
		Arrays.fill(dp, 0);
		for(int i = 0; i < n; i++) {
			for(int j = x; j >= w[i]; j--) {
				dp[j] = Math.max(dp[j], dp[j - w[i]] + p[i]);
			}
		}
//		for(int i = 1; i <= x; i++)System.out.print(dp[i] +" ");
		System.out.println(dp[x]);
	}
}

