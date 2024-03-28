package Introductory_Problems;
import java.util.*;
public class DiceCombinations {
	static int MAXSIZE = 1000001;
	static int MOD = 1000000007;
	static long count[] = new long[MAXSIZE];
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Arrays.fill(count, 0);
		count[0] = 1;
		compute(n);
		System.out.println(count[n]);
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
	public static long compute(int left) {
		if(count[left] != 0) {
			return count[left];
		}
		for(int i = 1; i <= 6; i++) {
			if(left - i >= 0) {
				count[left] += compute(left - i);
				count[left] = count[left] % MOD;
			}
		}
		return count[left];
	}
}
