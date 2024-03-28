package Introductory_Problems;
import java.util.*;
public class NestedRangesCheck {
	static class range{
		int left,right,index;
		range(int left, int right, int index){
			this.left = left;
			this.right = right;
			this.index = index;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[]contains = new boolean[n];
		Arrays.fill(contains, false);
		boolean[]contained = new boolean[n];
		Arrays.fill(contained, false);
		range ranges[] = new range[n];
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			range nr = new range(a, b,i);
			ranges[i] = nr;
		}
		Arrays.sort(ranges, (a, b) -> {
			if(a.left == b.left) {
				return b.right - a.right;
			}
			return a.left - b.left;
		});
		int minEnd  = Integer.MAX_VALUE;
		for(int i = n-1; i >= 0; i--) {
			if(ranges[i].right >= minEnd) {
				contains[ranges[i].index] = true;
			}
			minEnd = Math.min(minEnd, ranges[i].right);
		}
		int maxEnd = 0;
		for(int i  = 0; i < n; i++) {
			if(ranges[i].right <= maxEnd)
				contained[ranges[i].index] = true;
			maxEnd = Math.max(maxEnd, ranges[i].right);
		}
		for(int i  = 0; i < n; i++) {
			System.out.print((contains[i] == true)? 1 + " ":0 +" ");
		}
		System.out.println();
		for(int i  = 0; i < n; i++) {
			System.out.print((contained[i] == true)? 1 +" ":0 +" ");
		}
		
	}
}
