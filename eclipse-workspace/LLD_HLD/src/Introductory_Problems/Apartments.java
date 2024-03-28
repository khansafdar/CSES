package Introductory_Problems;
import java.util.*;
public class Apartments {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		long aprt[] = new long[n];
		long raprt[] = new long[m];
		for(int i  = 0; i < n; i++) {
			aprt[i] = sc.nextLong();
		}
		for(int i  = 0; i < m; i++) {
			raprt[i] = sc.nextLong();
		}
		Arrays.sort(raprt);
		Arrays.sort(aprt);
		int i  = 0 ;
		int j = 0;
		int count  = 0;
		while(i < n && j < m) {
			if((raprt[j] - k) <= aprt[i] && aprt[i] <= (raprt[j] + k )) {
				count += 1;
				i += 1;
				j += 1;
			}else if(raprt[j] < aprt[i]) {
				j += 1;
			}else {
				i += 1;
			}
		}
		System.out.println(count);
	}
}

