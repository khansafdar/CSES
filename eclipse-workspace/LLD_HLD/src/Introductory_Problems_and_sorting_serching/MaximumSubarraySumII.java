package Introductory_Problems;
import java.util.*;
public class MaximumSubarraySumII {
	static class pair{
		long val, index;
		pair(long val, int index){
			this.val = val;
			this.index = index;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		long pre[] = new long[n + 1];
		pre[0] = 0;
		for(int  i = 1; i <= n; i++) {
			pre[i] = pre[i -1] + sc.nextInt();
		}
		TreeSet<pair> set = new TreeSet<pair>((x, y) ->  {
			if(y.val == x.val && y.index == x.index)return 0;
			if(y.val > x.val) return 1;
			else return -1;
		});
		for(int i = a; i <= b; i++) {
			set.add(new pair(pre[i], i));
		}
		long maxValue = Long.MIN_VALUE;
		for(int i = 1; i <= n - a + 1; i++) {
			long val = set.first().val;
			//System.out.println(val +" "+ pre[i - 1]);
			maxValue = Math.max(maxValue,set.first().val - pre[i - 1]);
			set.remove(new pair(pre[i + a - 1], i + a- 1));
			if(i + b <= n)
				set.add(new pair(pre[i + b] , i + b));
		}
		System.out.println(maxValue);
	}
}
