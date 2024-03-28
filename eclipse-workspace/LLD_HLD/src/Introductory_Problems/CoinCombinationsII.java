package Introductory_Problems;
import java.util.*;
public class CoinCombinationsII {
	static int MAXSIZE = 1000001;
	static int count[] = new int[MAXSIZE];
	static int MOD = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		Arrays.fill(count, 0);
		count[0] = 1;
		int nums[] = new int[n];
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		for(int i = 0; i < n ; i++) {
			for(int j = nums[i]; j <= x; j++) {
				count[j] = (count[j] + count[j - nums[i]]) % MOD; 
			}
		}
		System.out.println(count[x]);
	}

}
