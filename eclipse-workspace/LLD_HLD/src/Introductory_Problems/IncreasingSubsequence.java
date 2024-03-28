package Introductory_Problems;
import java.util.*;
public class IncreasingSubsequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeSet<Integer>set = new TreeSet<Integer>();
		for(int i = 0; i < n; i++) {
			int val = sc.nextInt();
			if(set.ceiling(val) == null) {
				set.add(val);
			}else {
				set.remove(set.ceiling(val));
				set.add(val);
			}
		}
		System.out.println(set.size());
	}
}
