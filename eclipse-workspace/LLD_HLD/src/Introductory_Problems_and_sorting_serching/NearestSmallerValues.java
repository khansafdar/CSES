package Introductory_Problems;
import java.util.*;
public class NearestSmallerValues {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int[n + 1];
		int np[] = new int[n + 1];
		for(int i = 1; i <= n; i++) {
			nums[i] = sc.nextInt();
			int k = i - 1;
			while(nums[k] >= nums[i]) 
				k = np[k];
			np[i] = k;
		}
		for(int i = 1; i <= n; i++) {
			System.out.print(np[i] +" ");
		}
	}

}
/*
8
2 5 1 4 8 3 2 5 ->input
0 1 0 3 4 3 3 7 ->ans
1 2 2 3 4 5 5 8 ->  sorting

 
 
 */
