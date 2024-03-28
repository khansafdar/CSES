package Introductory_Problems;
import java.util.*;

public class Projects {
	static class project{
		int start, end;
		long reward;
		project(int start, int end, long reward){
			this.start = start;
			this.end = end;
			this.reward = reward;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		project projects[] = new project[n];
		for(int i = 0; i < n; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			int reward = sc.nextInt();
			project np = new project(start, end, reward);
			projects[i] = np;
		}
		Arrays.sort(projects, (a, b) ->{
//			if(a.end == b.end)return a.start - b.start;
			return a.end - b.end;
		});
		TreeMap<Integer,Long> map = new TreeMap<Integer, Long>();
		map.put(0, 0L);
		long maximum_money = 0;
		for(int i = 0; i < n; i++) {
//			System.out.println(maximum_money);
			long prevValue = map.lowerEntry(projects[i].start).getValue();
			long totalReward = prevValue + projects[i].reward;
			maximum_money = Math.max(maximum_money, totalReward);
			map.put(projects[i].end, maximum_money);
		}
		System.out.println(maximum_money);
	}

}
