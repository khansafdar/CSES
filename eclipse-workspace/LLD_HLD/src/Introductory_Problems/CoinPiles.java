package Introductory_Problems;
import java.util.*;
public class CoinPiles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			if(Math.max(a, b) > 2 * Math.min(a, b)) {
				System.out.println("NO");
			}else {
				if((a + b) % 3 == 0) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}
		}
	}
}
