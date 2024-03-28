package Graph_Algorithms;
import java.util.*;
public class RoundTrip {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean vis[] = new boolean[n + 1];
		int par[] = new int[n + 1];
		ArrayList<ArrayList<Integer>> relation = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i <= n; i++)relation.add(new ArrayList<Integer>());
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			relation.get(a).add(b);
			relation.get(b).add(a);
		}
		Arrays.fill(par, -1);
		Arrays.fill(vis, false);
		for(int i = 1; i <= n; i++) {
			if(!vis[i]) {
				if(DetectCycle(i, relation, vis, par)) {
					return;
				}
			}
		}
		System.out.println("IMPOSSIBLE");
	}
	public static boolean DetectCycle(int src, ArrayList<ArrayList<Integer>>rel, boolean vis[], int par[]) {
		vis[src] = true;
		for(int x : rel.get(src)) {
			if(!vis[x]) {
				vis[x] = true;
				par[x] = src;
				if(DetectCycle(x, rel, vis, par))return true;
				
			}else if(par[src] != x) {
				int st = src;
				ArrayList<Integer>ans = new ArrayList<Integer>();
				ans.add(src);
				while(st != x) {
					st = par[st];
					ans.add(st);
				}
				ans.add(src);
				System.out.println(ans.size());
				for(int val : ans)System.out.print(val +" ");
				return true;
			}
		}
		return false;
	}
}
