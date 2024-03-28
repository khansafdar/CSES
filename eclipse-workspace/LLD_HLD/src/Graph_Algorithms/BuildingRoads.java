package Graph_Algorithms;
import java.util.*;
public class BuildingRoads {
	static int MAXSIZE = 100001;
	public static class Disjoint_Set {
		static int parent[];
		static int rank[];
		int num;
		public Disjoint_Set(int N){
			num = N;
			parent = new int[MAXSIZE];
			rank = new int[MAXSIZE];
			mask();
		}
		public void mask() {
			for(int i = 0; i < MAXSIZE; i++) {
				parent[i] = i;
				rank[i] = 0;
			}
		}
		public boolean union(int elex, int eley) {
			int parx = find(elex);
			int pary = find(eley);
			if(parx == pary)return false;
			if(rank[parx] < rank[pary]) {
				parent[parx] = pary;
			}else if(rank[parx] > rank[pary]) {
				parent[pary] = parx;
			}else {
				parent[parx] = pary;
				rank[parx]++;
			}
			num -= 1;
			return true;
		}
		public int find(int ele) {
			if(parent[ele] == ele)return ele;
			return parent[ele] = find(parent[ele]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> disjointSet = new HashSet<Integer>();
		int city = sc.nextInt();
		int road = sc.nextInt();
		Disjoint_Set dsu = new Disjoint_Set(city);
		for(int i = 0; i < road; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			dsu.union(a, b);
		}
		System.out.println(dsu.num - 1);
		for(int i = 1; i <= city; i++) {
			if(dsu.union(1, i)) {
				System.out.println(1 + " " + i);
			}
		}
	}
}
