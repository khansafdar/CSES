package Graph_Algorithms;
import java.util.*;
public class CountingRooms {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char grid[][] = new char[n][m];
		int count = 0;
		for(int i = 0; i < n; i++) {
			String str = sc.next();
			for(int j = 0; j < m; j++) {
				grid[i][j] = str.charAt(j);
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(grid[i][j] == '.') {
					DFS(i, j, n, m, grid);
					count +=1;
				}
			}
		}
		System.out.println(count);
	}
	public static void DFS(int i, int j, int n, int m, char grid[][]) {
		grid[i][j] = '#';
		if(i + 1 < n && grid[i + 1][j] == '.') {
			DFS(i + 1, j, n, m, grid);
		}
		if(i - 1 >= 0 && grid[i - 1][j] == '.') {
			DFS(i - 1, j, n, m, grid);
		}
		if(j + 1 < m && grid[i][j + 1] == '.') {
			DFS(i, j + 1, n, m, grid);
		}
		if(j - 1 >= 0 && grid[i][j - 1] == '.') {
			DFS(i, j - 1, n , m, grid);
		}
	}
}