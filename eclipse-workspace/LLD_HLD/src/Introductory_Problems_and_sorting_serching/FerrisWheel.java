package Introductory_Problems;
import java.util.*;
public class FerrisWheel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long x = sc.nextLong();
		long nums[] = new long[n]; 
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextLong();
		}
		Arrays.sort(nums);
		int  i = 0 ;
		int count = 0;
		for(int j = n - 1 ; j>= i; j--) {
			if(nums[i] + nums[j] <= x) 
				i += 1;
			count += 1;
		}
		System.out.println(count);
	}
}
