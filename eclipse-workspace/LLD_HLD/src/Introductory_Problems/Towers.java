package Introductory_Problems;
import java.util.*;
import java.util.Map.Entry;
public class Towers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		TreeMap<Integer, Integer> set= new TreeMap<Integer, Integer>();
		for(int i = 0; i < n; i++) {
			int val = sc.nextInt();
			if(set.ceilingKey(val + 1) != null) {
				Entry<Integer, Integer> value = set.ceilingEntry(val + 1); 
				if(value.getValue() == 1) {
					set.remove(value.getKey());
				}else {
					set.put(value.getKey(), value.getValue() - 1);
				}
			}
			if(set.containsKey(val)) {
				set.put(val, set.get(val) + 1);
			}else {
				set.put(val, 1);
			}
		}
		ans = 0;
		for(Entry<Integer, Integer>entry : set.entrySet()) {
			ans += entry.getValue();
		}
		System.out.println(ans );
	}
}
