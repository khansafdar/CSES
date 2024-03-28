package Introductory_Problems;
import java.util.*;
public class ChessboardandQueens {
	static long countNo = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		countNo = 0; 
		char board[][] = new char[8][8];
		for(int i = 0; i < 8; i++) {
			String x = sc.next();
			for(int j = 0; j < 8; j++) {
				board[i][j] = x.charAt(j);
			}
		}
		count(7, 7, board, 0L);
		System.out.println(countNo);
		
	}
	public static void count(int i, int  j, char board[][], long placed) {
		if(placed == 8) {
			countNo += 1;
		}
		if( i < 0 || j < 0)return;
		for(int k1 = i ; k1  >= 0; k1--) {
			for(int k2 = j; k2 >= 0; k2--) {
				if(isValid(k1, k2, board)) {
					board[k1][k2] = 'q';
					count(k1 - 1, 7, board, placed + 1);
					board[k1][k2] = '.';
				}
			}
		}
	}
	public static boolean isValid(int i, int j, char board[][]) {
		if(board[i][j] == '*')return false;
		for(int k = i + 1; k < 8 ; k++) {
			if(board[k][j] == 'q')return false;
		}
		for(int k = 1; k < 8 ; k++) {
			if(i + k >=8 || j + k >=8 )break;
			if(board[i + k][j + k] == 'q')return false;
		}
		for(int k = 1; k < 8 ; k++) {
			if(i + k >=8 || j - k < 0 )break;
			if(board[i + k][j - k] == 'q')return false;
		}
		return true;
	}
}
