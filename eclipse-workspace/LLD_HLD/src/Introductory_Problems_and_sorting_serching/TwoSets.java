package Introductory_Problems;
import java.util.*;
public class TwoSets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		StringBuilder set1 = new StringBuilder();
		StringBuilder set2 = new StringBuilder();
		long totalSum = (n * (n + 1))/2;
		if((totalSum & 1) == 1) {
			System.out.println("NO");
			return;
		}
		long count1 = 0;
		long count2 = 0;
		long halfSum = totalSum / 2;
		for(long i = n; i >= 1; i--) {
			if(i <= halfSum) {
				set1.append(i +" ");
				halfSum -= i;
				count1 += 1;
			}else set2.append(i +" ");
		}
		System.out.println("YES");
		System.out.println(count1);
		System.out.println(set1.toString());
		System.out.println(n - count1);
		System.out.println(set2.toString());
		
	}

}
