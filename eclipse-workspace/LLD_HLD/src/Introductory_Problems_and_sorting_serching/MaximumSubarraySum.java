package Introductory_Problems;
import java.util.*;
public class MaximumSubarraySum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum = 0;
		long maxSum = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			sum += sc.nextInt();
			maxSum = Math.max(maxSum, sum);
			if(sum < 0)sum = 0;
		}
		System.out.println(maxSum);
		
	}
}
