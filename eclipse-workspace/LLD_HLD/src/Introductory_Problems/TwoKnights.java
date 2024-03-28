package Introductory_Problems;
import java.util.*;
public class TwoKnights {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		for(long n = 1; n <= N; n++) {
			long totalWays = ((n * n) * (n * n -1))/2;
			long totalWaytoAttach = 4 * (n - 1) * (n - 2);
			System.out.println(totalWays - totalWaytoAttach);
		}
		
	}
}
