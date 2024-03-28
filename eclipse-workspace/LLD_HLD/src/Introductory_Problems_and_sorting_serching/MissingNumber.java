package Introductory_Problems;
import java.util.*;
public class MissingNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long totalSum = n*(n + 1)/2;
		long sum = 0;
		for(int i = 0; i < n-1; i++) {
			sum += sc.nextInt();
		}
		System.out.println((totalSum - sum));
	}
}
