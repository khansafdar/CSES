package Graph_Algorithms;
import java.util.*;
public class MessageRoute {
	static class pair{
		int cmp;
		ArrayList<Integer>path;
		pair(int cmp, ArrayList<Integer> path){
			this.cmp = cmp;
			this.path = path;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cmp = sc.nextInt();
		int conn = sc.nextInt();
		ArrayList<ArrayList<Integer>>conns = new ArrayList(cmp);
		for(int i = 0; i <= cmp; i++)conns.add(new ArrayList<Integer>());
		for(int i = 0; i < conn; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			conns.get(a).add(b);
			conns.get(b).add(a);
		}
		boolean vis[] = new boolean[cmp + 1];
		ArrayList<Integer>initialPath = new ArrayList<Integer>();
		initialPath.add(1);
		pair np = new pair(1, initialPath);
		LinkedList<pair>queue = new LinkedList<pair>();
		queue.add(np);
		while(!queue.isEmpty()) {
			pair rp = queue.poll();
			int currCmp = rp.cmp;
			ArrayList<Integer>currPath = rp.path;
			if(currCmp == cmp) {
				System.out.println(currPath.size());
				for(int p : currPath) {
					System.out.print(p +" ");
				}
				return;
			}
			if(vis[currCmp])continue;
			vis[currCmp] = true;
			for(int x : conns.get(currCmp)) {
				if(!vis[x]) {
					ArrayList<Integer>newPath = new ArrayList<Integer>(currPath);
					newPath.add(x);
					pair nsp = new pair(x, new ArrayList<Integer>(newPath));
					queue.add(nsp);
				}
			}
		}
		System.out.println("IMPOSSIBLE");
	}
}




