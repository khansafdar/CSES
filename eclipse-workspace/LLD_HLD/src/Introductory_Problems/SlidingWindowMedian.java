package Introductory_Problems;
import java.util.*;
public class SlidingWindowMedian {
	int n;
	int k;
	int nums[];
	int MAXSIZE = 200005;
	int BIT[];
	TreeSet<Integer> set;
	HashMap<Integer, Integer> valToIndex;
	HashMap<Integer, Integer> indexToVal;
	SlidingWindowMedian(){
		BIT = new int[MAXSIZE];
		nums = new int[MAXSIZE];
		set = new TreeSet<Integer>();
		valToIndex = new HashMap<Integer, Integer>();
		indexToVal = new HashMap<Integer, Integer>();
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		Arrays.fill(BIT, 0);
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
			set.add(nums[i]);
		}
		int count = 1;
		for(int x : set) {
			valToIndex.put(x, count);
			indexToVal.put(count, x);
			count += 1; 
		}
	}
	public int solve() {
		int low = 1; 
		int high = set.size();
		int kk = (k + 1) / 2;
		int ans = -1;
		while(low <= high) {
			int mid = low + (high - low) / 2;
			int val = query(mid);
			if(val >= kk) {
				high = mid - 1;
				ans = mid;
			}else {
				low = mid + 1;
			}
		}
		return ans;
	}
	public void update(int index, int val) {
		while(index <= set.size() ) {
			BIT[index] += val;
			index += (index & (-index));
		}
	}
	public int query(int index) {
		int sum = 0;
		while(index > 0) {
			sum += BIT[index];
			index -= (index & (-index));
		}
		return sum;
	}
	public void findMedian() {
		for(int i = 0; i < k; i++) {
			update(valToIndex.get(nums[i]), 1);
		}
		System.out.print(indexToVal.get(solve())+" ");
		for(int i = k; i < n; i++) {
			update(valToIndex.get(nums[i]), 1);
			update(valToIndex.get(nums[i - k]), -1);
			System.out.print(indexToVal.get(solve()) +" ");
		}
	}
	public static void main(String[] args) {
		SlidingWindowMedian  obj = new SlidingWindowMedian();
		obj.input();
		obj.findMedian();
	}
}
