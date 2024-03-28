package Graph_Algorithms;
import java.util.*;
public class BuildingTeams {
	public static class pair{
		int pupil;
		int color;
		pair(int pupil, int color){
			this.pupil = pupil;
			this.color = color;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<ArrayList<Integer>> relation = new ArrayList();
		for(int i = 0; i <= n; i++)relation.add(new ArrayList<Integer>());
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			relation.get(a).add(b);
			relation.get(b).add(a);
		}
		int group[] = new int[n + 1];
		Arrays.fill(group, 0);
		if(isBipartite(relation, n, group)) {
			for(int i = 1; i <= n; i++)System.out.print(group[i] +" ");
		}else {
			System.out.println("IMPOSSIBLE");
//			for(int i = 1; i <= n; i++)System.out.print(group[i] +" ");
		}
		
	}
	public static boolean isBipartite(ArrayList<ArrayList<Integer>> relation, int n, int group[]) {
		LinkedList<pair>queue = new LinkedList<pair>();
		for(int i = 1; i <= n; i++) {
			if(group[i] == 0) {
				group[i] = 1;
				pair np = new pair(i, 1);
				queue.add(np);
				while(!queue.isEmpty()) {
					pair rp = queue.remove();
					int pupil = rp.pupil;
					int color = rp.color;
					for(int x : relation.get(pupil)) {
						if(group[x] == color) return false;
						if(group[x] == 0) {
							int newColor = (color == 1)? 2:1;
							group[x] = newColor;
							pair nsp = new pair(x, newColor);
							queue.add(nsp);
						}
					}
				}
			}
		}
		return true;
	}
}




/*
5 3
1 2
2 3
3 1
*/