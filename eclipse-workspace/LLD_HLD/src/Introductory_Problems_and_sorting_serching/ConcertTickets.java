package Introductory_Problems;
import java.util.*;
public class ConcertTickets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		TreeMap<Integer,Integer> set = new TreeMap<Integer,Integer>(); 
		for(int i = 0; i < n; i++) {
			int val = sc.nextInt();
			if(set.containsKey(-val))
				set.put(-val, set.get(-val) + 1);
			else set.put(-val, 1);
		}
		for(int i =0 ; i < m ; i++) {
			int val = sc.nextInt();
			if(set.ceilingKey(-val) == null) {
				System.out.println(-1); 
			}else {
				int value = set.ceilingKey(-val);
				System.out.println(-1 * value);
				if(set.get(value) == 1) {
					set.remove(value);
				}else {
					set.put(value, set.get(value) - 1);
				}
			}
		}
	}
}
