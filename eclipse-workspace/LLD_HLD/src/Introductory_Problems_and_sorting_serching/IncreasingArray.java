package Introductory_Problems;
import java.util.*;
public class IncreasingArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int[n];
		// input take
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		long minCount = 0;
		for(int i = 1;i < n; i++) {
			if(nums[i] < nums[i - 1]) {
				minCount += nums[i - 1] - nums[i];
				nums[i] = nums[ i - 1];
			}
		}
		System.out.println(minCount);
		
	}

}
