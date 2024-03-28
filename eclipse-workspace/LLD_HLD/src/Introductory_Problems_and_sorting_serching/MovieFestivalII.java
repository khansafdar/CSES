package Introductory_Problems;
import java.util.*;
public class MovieFestivalII {
	static class pair{
		int start,end;
		pair(int start, int end){
			this.start = start;
			this.end = end;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		pair nums[] = new pair[n]; 
		for(int i = 0; i < n; i++) {
			pair np = new pair(sc.nextInt(), sc.nextInt());
			nums[i] = np;
		}
		TreeMap<Integer, Integer> set = new TreeMap<Integer, Integer>();
		Arrays.sort(nums, (a, b) -> {
			if(a.end == b.end) {
				return a.start - b.start; 
			}
			return a.end - b.end;
		});
		int i = 1;
		k -= 1;
		int count = 1;
		insert(nums[0].end, set);
		while(i < n) {
			if(k > 0) {
				insert(nums[i].end, set);
				count += 1;
				k -= 1;
			}else {
				int val = set.firstKey();
				if(val < nums[i].start) {
					remove(val, set);
					insert(nums[i].end, set);
					count += 1;
				}
			}
			i += 1;
		}
		System.out.println(count);
	}
	public static void insert(int val, TreeMap<Integer, Integer>set) {
		if(set.containsKey(val)) {
			set.put(val, set.get(val) + 1);
		}else {
			set.put(val, 1);
		}
		
	}
	public static void remove(int val, TreeMap<Integer, Integer>set) {
		if(set.containsKey(val)) {
			int value = set.get(val);
			if(value == 1)set.remove(val);
			else set.put(val, value - 1);
		}
		
	}
}

/*
5 2
1 5
8 10
3 6
2 5
6 9
*/