package Introductory_Problems;
import java.util.*;
public class CoinCombinationsI {
	static int MAXVALUE = 1000001;
	static int MOD = 1000000007;
	static long count[] = new long[MAXVALUE];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int nums[] = new int[n];
		for(int i  = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		Arrays.fill(count, 0);
		count[0] = 1;
		for(int i = 1; i <= x; i++) {
			for(int j = 0; j < n; j++) {
				if(i - nums[j] >=0) {
					count[i] = (count[i] + count[i - nums[j]]) % MOD;
				}
			}
		}
		System.out.println(count[x]);
	}
}
