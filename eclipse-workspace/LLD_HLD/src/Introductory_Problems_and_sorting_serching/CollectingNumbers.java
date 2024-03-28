package Introductory_Problems;
import java.util.*;
public class CollectingNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		int nums[] = new int[n + 1];
		for(int i = 0; i< n; i++) {
			nums[sc.nextInt()] = i;
		}
		int round = 1;
		for(int i = 2; i <= n; i++) {
			if(nums[i-1] > nums[i]) {
				round += 1;
			}
		}
		System.out.println(round);
	}
}
