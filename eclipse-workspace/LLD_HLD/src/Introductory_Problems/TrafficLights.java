package Introductory_Problems;
import java.util.*;
import java.util.Map.Entry;
public class TrafficLights {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int  n = sc.nextInt();
		TreeMap<Integer, Integer>set = new TreeMap<Integer, Integer>();
		set.put(x , 1);
		TreeSet<Integer> index = new TreeSet<Integer>();
		index.add(0);
		index.add(x);
		for(int i = 0; i < n; i++) {
			int pos = sc.nextInt();
			int next = index.higher(pos);
			int prev = index.lower(pos);
			int val = next - prev;
			if(set.containsKey(val)) {
				int value = set.get(val);
				if(value == 1)set.remove(val);
				else set.put(val, value - 1);
			}
			index.add(pos);
			if(set.containsKey(pos - prev)) {
				int value = set.get(pos - prev);
				set.put(pos - prev, value + 1);
			}else {
				set.put(pos - prev, 1);
			}
			if(set.containsKey(next - pos)) {
				int value = set.get(next - pos);
				set.put(next - pos, value + 1);
			}else {
				set.put(next - pos, 1);
			}
			System.out.print(set.lastKey() +" ");
//			for(Entry<Integer, Integer> xx : set.entrySet())System.out.print(xx.getKey()+" ");
//			System.out.println();
		}
	}
}
