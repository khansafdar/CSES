package Introductory_Problems;
import java.util.*;
public class MissingCoinSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int nums[] = new int[n];
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		Arrays.sort(nums);
		long res = 1;
		for(int i = 0;i < n && nums[i] <= res; i++) {
			res += nums[i];
		}
		System.out.println(res);
		
		
	}
}
