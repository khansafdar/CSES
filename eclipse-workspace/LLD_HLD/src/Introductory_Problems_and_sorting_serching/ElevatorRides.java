package Introductory_Problems;
import java.util.*;

public class ElevatorRides {
	static long max = (long)1e9;
	static class pair{
		long ride,space;
		pair(long ride, long space){
			this.ride = ride;
			this.space = space;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		pair dp[] = new pair[1 << n];
		int weight[] = new int[n];
		for(int i = 0; i < n; i++) {
			weight[i] = sc.nextInt();
		}
		pair np = new pair(1L, 0);
		dp[0] = np;
		for(int mask = 1; mask < (1 <<  n); mask++) {
			if(dp[mask] == null) {
				dp[mask] =  new pair(max, max);
			}
			for(int bit = 0; bit < n; bit++) {
				if( ((1 << bit) & mask) > 0) {
					int subIndex = mask^(1 << bit);
					long space_taken = dp[subIndex].space;
					if(space_taken + weight[bit] <= x) {
						dp[mask] = min(dp[mask],new pair(dp[subIndex].ride, space_taken + weight[bit]));
					}else {
						dp[mask] = min(dp[mask], new pair(dp[subIndex].ride + 1, weight[bit]));
					}
//					System.out.println(mask +" "+dp[mask].ride );
				}
			}
		}
//		for(int i = 1; i < (1 <<n); i++)System.out.println(dp[i].ride + " " + dp[i].space);
		System.out.println(dp[(1 << n) - 1].ride);
	}
	public static pair min(pair a, pair b) {
		if(a.ride < b.ride) {
			return a;
		}else if(a.ride == b.ride) {
			if(a.space < b.space)return a;
			else return b;
		}else return b;
	}
}
