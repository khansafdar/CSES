package Introductory_Problems;
import java.util.*;
public class SlidingWindowCost {
	int n;
	int k;
	int BIT[];
	int nums[];
	int MAXSIZE = 200005;
	HashMap<Integer, Integer> valToIndex, indexToVal;
	TreeSet<Integer> set;
	SlidingWindowCost(){
		BIT = new int[MAXSIZE];
		nums = new int[MAXSIZE];
		valToIndex = new HashMap<Integer, Integer>();
		indexToVal = new HashMap<Integer, Integer>();
		set = new TreeSet<Integer>();
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
			set.add(nums[i]);
		}
	} 
	public void mapping() {
		int count = 1;
		for(int x : set) {
			valToIndex.put(x, count);
			indexToVal.put(count, x);
			count += 1;
		}
	}
	public void update(int index, int val) {
		for(; index <= n; index += (index & -index)) {
			BIT[index] += val;
		} 
	}
	public int query(int index) {
		int sum = 0;
		for(; index > 0; index -= (index& -index)) {
			sum += BIT[index];
		}
		return sum;
	}
	public int solve() {
		int low = 1;
		int high = set.size();
		int kk = (k + 1) / 2;
		int ans = -1;
		while(low <= high) {
			int mid = low + (high - low)/2;
			int val = query(mid);
			if(val >= kk) {
				ans = mid;
				high = mid - 1;
			}else {
				low = mid + 1;
			}
		}
		return ans;
	}
	public void findCost() {
		int cost = 0; 
		for(int i = 0; i < k; i++) {
			update(valToIndex.get(nums[i]), 1);
		}
		int oldMed = indexToVal.get(solve());
		for(int i  = 0; i < k; i++) {
			cost += Math.abs(oldMed - nums[i]);
		}
		System.out.print(cost+" ");
		for(int i = k; i < n; i++) {
			update(valToIndex.get(nums[i]), 1);
			update(valToIndex.get(nums[i - k]), -1);
			int med = indexToVal.get(solve());
			cost += (Math.abs(med - nums[i]) - Math.abs(oldMed - nums[i - k]));
			if(k % 2 == 0) {
				cost += (oldMed - med);
			}
			oldMed = med;
			System.out.print(cost+" ");
		}
		
	}

	public static void main(String[] args) {
		SlidingWindowCost obj = new SlidingWindowCost();
		obj.input();
		obj.mapping();
		obj.findCost();	
	}
}


/*
8 3
2 4 3 5 8 1 2 1
2 2 5 7 7 1
 
*/