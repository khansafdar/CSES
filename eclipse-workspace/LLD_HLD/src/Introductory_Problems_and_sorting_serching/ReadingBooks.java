package Introductory_Problems;
import java.util.*;
public class ReadingBooks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long maxVal = 0;
		long sum = 0;
		for(int i = 0; i< n; i++) {
			long val = sc.nextLong();
			maxVal = Math.max(maxVal, val);
			sum += val;
		}
		System.out.println(Math.max(sum, 2 * maxVal));
	}
}
