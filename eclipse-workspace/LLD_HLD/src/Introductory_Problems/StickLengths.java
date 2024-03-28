package Introductory_Problems;
import java.util.*;
public class StickLengths {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int[n];
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		Arrays.sort(nums);
		long sum = 0;
		int median = nums[(n - 1) / 2];
		for(int i = 0; i < n; i++) {
			sum += Math.abs(median - nums[i]);
		}
		System.out.println(sum);
		
	}
}
