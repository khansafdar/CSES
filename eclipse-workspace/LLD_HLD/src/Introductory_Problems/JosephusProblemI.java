package Introductory_Problems;
import java.util.*;
public class JosephusProblemI {
	static ArrayList<Integer> ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ans = new ArrayList<Integer>();
		int n = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<Integer> per = new ArrayList<Integer>();
		for(int i = 1; i <= n; i++)per.add(i);
		
		solve(per, k,0);
		for(Integer x: ans)System.out.print(x +" ");
	}
	public static void solve(ArrayList<Integer>per, int k, int index) {
		if(per.size() == 1) {
			ans.add(per.get(0));
			return;
		}
		index = (index + k) % per.size();
		ans.add(per.remove(index));
		solve(per, k, index);
	}
}
