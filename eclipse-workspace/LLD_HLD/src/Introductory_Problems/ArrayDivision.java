package Introductory_Problems;
import java.util.*;
public class ArrayDivision {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long nums[] = new long[n];
		long high = 0;
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
			high += nums[i];
		}
		long low = 0;
		long ans = -1;
		while(low <= high) {
			long mid = low + (high - low)/2;
			if(isValid(nums,k,mid)) {
				high = mid -1;
				ans = mid;
			}else {
				low = mid + 1;
			}
		}
		System.out.println(ans);
	}
	public static boolean isValid(long nums[], int k, long mid) {
		int count = 0;
		long sum = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > mid)return false;
			sum += nums[i];
			if(sum > mid) {
				sum = nums[i];
				count += 1;
			}
		}
		if(count < k)return true;
		return false;
	}
}
