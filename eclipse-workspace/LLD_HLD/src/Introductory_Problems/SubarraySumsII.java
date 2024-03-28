package Introductory_Problems;
import java.util.*;
public class SubarraySumsII {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long x = sc.nextInt();
		long nums[] = new long[n];
		HashMap<Long, Long>map = new HashMap<Long, Long>();
		map.put(0L, 1L);
		long sum = 0;
		long count = 0;
		for(int i = 0; i < n; i++) {
			long val = sc.nextLong();
			sum += val;
			if(map.containsKey(sum - x)) {
				count += map.get(sum - x);
			}
			if(map.containsKey(sum)) {
				map.put(sum, map.get(sum) + 1);
			}else
				map.put(sum, 1L);
		}
		System.out.println(count);
	}
}
