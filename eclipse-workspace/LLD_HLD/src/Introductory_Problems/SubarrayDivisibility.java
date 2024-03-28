package Introductory_Problems;
import java.util.*;
public class SubarrayDivisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Long, Long> map = new HashMap<Long, Long>();
		map.put(0L, 1L);
		long sum = 0;
		long count = 0 ;
		for(int i = 0; i < n; i++) {
			int val = sc.nextInt();
			sum += val;
			sum = (sum % n + n) % n;
			if(map.containsKey(sum)) {
				Long value = map.get(sum);
				count += value;
				value += 1;
				map.put(sum, value);
			}else 
				map.put(sum, 1L);
		}
		System.out.println(count);
	}

}
