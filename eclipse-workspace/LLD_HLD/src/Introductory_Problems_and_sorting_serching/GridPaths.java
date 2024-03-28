package Introductory_Problems;
import java.util.*;
public class GridPaths {

	static int N = 7;
	static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String path = sc.next();
		count = 0;
		boolean vis[][] = new boolean[7][7]; 
		findAllPath(0, 0, path, 0, vis);
		System.out.println(count);
	}
	public static boolean isValid(int i, int j) {
		return  i >= 0 && i < N && j >= 0 && j < N;
 	}
	public static void findAllPath(int i, int j,String path, int index, boolean vis[][]) {
		if(index == N*N-1 || (i == N - 1 && j == 0)){
	        count += (index == N*N-1 && (i == N - 1 && j == 0))? 1: 0;
	        return;
	    }
		if((!isValid(i, j + 1) || vis[i][j + 1]) && (!isValid(i, j - 1 ) || vis[i][j - 1]))
				if((isValid(i + 1, j) && !vis[i + 1][j]) && (isValid(i - 1, j) && !vis[i - 1][j]))
						return;
		if((!isValid(i + 1, j) || vis[i + 1][j]) && (!isValid(i - 1, j) || vis[i - 1][j]))
			if((isValid(i, j + 1) && !vis[i][j + 1]) && (isValid(i, j - 1) && !vis[i][j - 1]))
					return;
		vis[i][j] = true;
		if(path.charAt(index) == 'R' || path.charAt(index) == '?') {
			if(isValid(i, j + 1) && !vis[i][j + 1])
				findAllPath(i, j + 1, path, index + 1, vis);
		}
		if(path.charAt(index) == 'D' || path.charAt(index) == '?') {
			if(isValid(i + 1, j) && !vis[i + 1][j])
				findAllPath(i + 1, j, path, index + 1, vis);
		}
		if(path.charAt(index) == 'L' || path.charAt(index) == '?') {
			if(isValid(i, j  - 1) && !vis[i][j - 1])
				findAllPath(i, j - 1, path, index + 1, vis);
		}
		if(path.charAt(index) == 'U' || path.charAt(index) == '?') {
			if(isValid(i - 1, j) && !vis[i - 1][j])
				findAllPath(i - 1, j, path, index + 1, vis);
		}
		vis[i][j] = false;
	}
}
