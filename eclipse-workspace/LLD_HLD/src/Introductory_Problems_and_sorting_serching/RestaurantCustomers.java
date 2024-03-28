package Introductory_Problems;
import java.util.*;
public class RestaurantCustomers {

	static class pair{
		int event;
		int time;
		pair(int time,int event){
			this.event = event;
			this.time = time;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pair res[] = new pair[2 * n];
		for(int i = 0; i< n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			pair p1 = new pair(a, 1);
			pair p2 = new pair(b,-1);
			res[2 * i] = p1;
			res[2 * i + 1] = p2;
		}
		Arrays.sort(res,new Comparator<pair>() {
			public int compare(pair a, pair b) {
				if(a.time == b.time)return a.event - b.event;
				else return a.time - b.time;
			}
		});
		int maxCount = 0;
		int count = 0;
		for(int i  = 0;i < 2*n; i++) {
			count += res[i].event;
			maxCount = Math.max(maxCount, count);
		}
		System.out.println(maxCount);
	}
}
