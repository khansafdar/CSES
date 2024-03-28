package Introductory_Problems;
import java.util.*;
public class TrailingZeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long diviser = 5;
		long n = sc.nextLong();
		long res = 0;
		while(diviser <= n) {
			res += n / diviser;
			diviser *= 5;
		}
		System.out.println(res);
	}
	
}
