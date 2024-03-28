package Introductory_Problems;
import java.util.*;
public class BitStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long ans = 1;
		long mod = (long)1e9 + 7;
		for(int i = 1; i <= n; i++) {
			ans = (ans * 2) % mod ; 
		}
		System.out.println(ans);
	}
}
