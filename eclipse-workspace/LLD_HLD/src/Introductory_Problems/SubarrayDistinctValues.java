package Introductory_Problems;
import java.util.*;
public class SubarrayDistinctValues {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int j = 0;
		long count = 0;
		int nums[] = new int[n];
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < n; i++) {
			int val = nums[i];
			insert(val, map);
			while(j <= i && map.size() > x) {
				remove(nums[j++], map);
			}
			if(map.size() <= x)count += (i - j + 1);
		}
		System.out.println(count);
	}
	public static void insert(int val, HashMap<Integer, Integer>map) {
		if(map.containsKey(val)) {
			map.put(val, map.get(val) + 1);
		}else {
			map.put(val, 1);
		}
	}
	public static void remove(int val, HashMap<Integer, Integer>map) {
		int value = map.get(val);
		if(value > 1) {
			map.put(val, value - 1);
		}else {
			map.remove(val);
		}
	}
}
