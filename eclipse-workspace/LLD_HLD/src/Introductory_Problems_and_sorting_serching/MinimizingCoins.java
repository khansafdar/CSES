package Introductory_Problems;
import java.util.*;
public class MinimizingCoins {
	static int MAXSIZE = 1000001;
	static int count[] = new int[MAXSIZE];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int coins[] = new int[n];
		Arrays.fill(count, Integer.MAX_VALUE);
		for(int i = 0; i < n; i++) {
			coins[i] = sc.nextInt();
			count[coins[i]] = 1;
		}
		count[0] = 0;
		solve(coins, x);
		if(count[x]  == Integer.MAX_VALUE)System.out.println(-1);
		else System.out.println(count[x]);
	}
	public static int solve(int coins[], int x) {
		if(count[x] != Integer.MAX_VALUE) {
			return count[x];
		}
		int minValue = Integer.MAX_VALUE;
		for(int i = coins.length - 1; i >=0; i--) {
			if(x - coins[i] >= 0) {
				int val = solve(coins, x - coins[i]);
				if(val != Integer.MAX_VALUE)val += 1;
				minValue = Math.min(minValue, val);
			}
		}
		count[x] = Math.min(count[x], minValue); 
		return count[x];
	}
}

/*
3 3
4 5 7
 */