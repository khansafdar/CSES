package Introductory_Problems;
import java.util.*;
public class SubarraySumsI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int nums[] = new int[n];
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		int i = 0;
		int j = 0;
		long sum = 0; 
		int count = 0;
		while(j < n) {
			sum += nums[j];
			while(i <= j && sum > x) {
				sum -= nums[i];
				i += 1;
			}
			if(sum == x) {
				count += 1;
			}
			j += 1;
		}
		System.out.println(count);
	}
}
