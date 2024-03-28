package Introductory_Problems;
import java.util.*;
public class Permutations {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		if(n <= 1) {
			System.out.println(n);
			return;
		}
		if(n  < 4) {
			System.out.println("NO SOLUTION");
			return;
		}
		StringBuilder sb1= new StringBuilder();
		StringBuilder sb2= new StringBuilder();
		for(int i = 1; i <= n; i++) {
			if(i %2 == 0)
				sb1.append(i+" ");
			else 
				sb2.append(i+" ");
		}
		sb1.append(sb2);
		System.out.println(sb1.toString());
		
	}
}
