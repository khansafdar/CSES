package Introductory_Problems;
import java.util.*;
public class SumofTwoValues {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		int x = sc.nextInt();
		int nums[] = new int[n];
		HashMap<Integer, Integer> set = new HashMap<Integer, Integer>();
		for(int i = 0; i < n; i++) {
			int val = sc.nextInt();
			int rem = x - val;
			if(set.containsKey(rem)) {
				System.out.println((set.get(rem)+ 1) + " "+(i + 1));
				return;
			}else {
				set.put(val, i);
			}
		}
		System.out.println("IMPOSSIBLE");
	}
}
