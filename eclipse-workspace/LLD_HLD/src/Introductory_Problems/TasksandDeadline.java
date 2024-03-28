package Introductory_Problems;
import java.util.*;
public class TasksandDeadline {

	static class pair{
		int a,d;
		pair(int a, int d){
			this.a = a;
			this.d = d;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pair task[] = new pair[n];
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int d = sc.nextInt();
			pair np = new pair(a, d);
			task[i] = np;
		}
		Arrays.sort(task, (a, b) -> {
			if(a.a == b.a) {
				return a.d - b.d;
			}
			return a.a - b.a;
		});
		int reward = 0;
		int finish  = 0;
		for(int i = 0; i < n; i++) {
			finish += task[i].a;
			reward += task[i].d - finish;
		}
		System.out.println(reward);
		
	}
}
