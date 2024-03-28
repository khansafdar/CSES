package Introductory_Problems;
import java.util.*;
public class NestedRangesCount {
	static class pair{
		int x;
		int y;
		pair(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	static class tri{
		int x,y,index;
		tri(int x, int y, int index){
			this.x = x;
			this.y = y;
			this.index = index;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeSet<pair> set = new TreeSet<pair>((a, b) ->{
			if(a.x == b.x) {
				return a.y - b.y;
			}
			return a.x - b.x;
		});
		ArrayList<tri> ranges = new ArrayList<tri>();
		int contains[] = new int[n];  
		int contained[] = new int[n];
		Arrays.fill(contains, 0);
		Arrays.fill(contains, 0);
		for(int i = 0; i < n; i++ ) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			tri nt = new tri(a, b, i);
			ranges.add(nt);
		}
		Collections.sort(ranges, (a, b) -> {
			if(a.x == b.x) {
				return b.y - a.y;
			}
			return a.x - b.x;
		});
		for(int i = n - 1; i >= 0; i--) {
			pair np = new pair(ranges.get(i).y,  -1*i);
			set.add(np);
			int index = set.headSet(np).size();
			contains[ranges.get(i).index] = index;
		}
		for(int i = 0; i < n; i++ ) {
			System.out.print(contains[i]+" ");
		}
		set.clear();
		System.out.println();
		for(int i = 0; i < n; i++) {
			pair np = new pair(ranges.get(i).y,  -1*i);
			set.add(np);
			int index = set.headSet(np).size();
			int val = i - index;
			contained[ranges.get(i).index] = val;
		}
		for(int i = 0; i < n; i++ ) {
			System.out.print(contained[i]+" ");
		}
		
		
		
	}
}
