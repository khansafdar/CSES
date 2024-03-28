package DataStrructureImplementation;
import java.util.*;
public class Disjoint_Set {
	static int MAXSIZE = 100001;
	static int parent[];
	static int rank[];
	public Disjoint_Set(){
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
	public void union(int elex, int eley) {
		int parx = find(elex);
		int pary = find(eley);
		if(parx == pary)return;
		if(rank[parx] < rank[pary]) {
			parent[parx] = pary;
		}else if(rank[parx] > rank[pary]) {
			parent[pary] = parx;
		}else {
			parent[parx] = pary;
			rank[parx]++;
		}
	}
	public int find(int ele) {
		if(parent[ele] == ele)return ele;
		return parent[ele] = find(parent[ele]);
	}
}
