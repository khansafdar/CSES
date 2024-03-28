package Introductory_Problems;

import java.util.Scanner;

public class AppleDivision1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long arr[] = new long[n];
		long totalSum = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			totalSum += arr[i]; 
		}
		long totalhalf = (totalSum + 1) / 2;
		long sumA = 0;
		long sumB = 0;
		for(int  i = 0; i < n; i++) {
			if((sumA + arr[i]) > totalhalf) {
				sumB += arr[i];
			}else {
				sumA += arr[i];
			}
		}
		System.out.println(Math.abs(sumA - sumB));
//		long minDiff = Long.MAX_VALUE;
//		long ways = (long)Math.pow(2,n) - 1;
//		for(long  i = 0; i <= ways; i++) {
//			long temp = i;
//			int index  = 0;
//			
//			while(index < n) {
//				if((temp & 1) == 1) {
//					sumA += arr[index++];
//				}else {
//					sumB += arr[index++];
//				}
//				minDiff = Math.min(minDiff, Math.abs(sumA - sumB));
//				temp = temp >> 1;
//			}
//		}
//		System.out.println(minDiff);
		
	}
}

