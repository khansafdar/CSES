package Graph_Algorithms;
import java.util.*;
public class Labyrinth {
	static class pair{
		int x, y;
		String path = "";
		pair(int x, int y, String path){
			this.x = x;
			this.y = y;
			this.path = path;
		}
	}
	static String ans = "";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char grid[][] = new char[n][m];
		for(int i = 0; i < n; i++) {
			String str = sc.next();
			for(int j = 0; j < m; j++) {
				grid[i][j] = str.charAt(j);
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(grid[i][j] == 'A') {
					ans = BFS(i, j, grid, "");
				}
			}
		}
		if(ans.length() > 0)System.out.println("YES");
		else {System.out.println("NO");
		return;}
		System.out.println(ans.length());
		System.out.println(ans);
	}
	public static String BFS(int i, int j, char grid[][], String path) {
		pair np = new pair(i, j, "");
		LinkedList<pair> queue = new LinkedList<pair>(); 
		queue.add(np);
		int n = grid.length;
		int m = grid[0].length;
		while(!queue.isEmpty()) {
			pair rp = queue.poll();
			if(grid[rp.x][rp.y] == 'B')return rp.path;
			grid[rp.x][rp.y] = '#';
			i = rp.x;
			j = rp.y;
			if(i + 1 < n && (grid[i + 1 ][j] == '.' || grid[i + 1][j] =='B')) {
				pair snp = new pair(i  + 1, j, rp.path + "D");
				queue.add(snp);
			}
			if(i - 1 >= 0 && (grid[i - 1 ][j] == '.' || grid[i - 1][j] =='B')) {
				pair snp = new pair(i  - 1, j, rp.path + "U");
				queue.add(snp);
			}
			if(j + 1 < m && (grid[i][j + 1] == '.' || grid[i][j + 1] =='B')) {
				pair snp = new pair(i, j + 1, rp.path + "R");
				queue.add(snp);
			}
			if(j - 1 >= 0 && (grid[i][j - 1] == '.' || grid[i][j - 1] =='B')) {
				pair snp = new pair(i, j - 1, rp.path + "L");
				queue.add(snp);
			}
		}
		return "";
	}
}












