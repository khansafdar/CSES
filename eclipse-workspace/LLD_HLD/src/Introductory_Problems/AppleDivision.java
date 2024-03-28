package Introductory_Problems;
import java.util.*;
public class AppleDivision {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long arr[] = new long[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		long minDiff = Long.MAX_VALUE;
		long ways = (long)Math.pow(2,n) - 1;
		for(long  i = 1; i <= ways; i++) {
			long temp = i;
			int index  = 0;
			long sumA = 0;
			long sumB = 0;
			while(index < n) {
				if((temp & 1) == 1) {
					sumA += arr[index++];
				}else {
					sumB += arr[index++];
				}
				temp = temp >> 1;
			}
			minDiff = Math.min(minDiff, Math.abs(sumA - sumB));
		}
		System.out.println(minDiff);
		
	}
}
