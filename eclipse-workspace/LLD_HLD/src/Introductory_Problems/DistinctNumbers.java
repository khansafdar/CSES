package Introductory_Problems;
import java.util.*;
public class DistinctNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer>map = new HashSet<Integer>();
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			map.add(sc.nextInt());
		}
		System.out.println(map.size());
	}
}
