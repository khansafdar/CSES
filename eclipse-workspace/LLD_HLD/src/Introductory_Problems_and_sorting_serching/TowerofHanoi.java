package Introductory_Problems;
import java.util.*;
public class TowerofHanoi {
	static int count = 0;
	static ArrayList<String> res;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		count = 0;
		res = new ArrayList<String>();
		int n = sc.nextInt();
		TowerOfHanoi(n, 1, 3, 2);
		System.out.println(res.size());
		for(int i = 0; i < res.size() ; i++)System.out.println(res.get(i));
	}
	public static void TowerOfHanoi(int n ,int from,int to,int aux) {
		if(n == 0)return;
		TowerOfHanoi(n - 1, from, aux, to);
		res.add(from +" "+ to);
		TowerOfHanoi(n - 1, aux, to, from);
	}
}
