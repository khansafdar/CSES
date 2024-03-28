package Introductory_Problems;
import java.util.*;
public class Playlist {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int n = sc.nextInt();
		int index = 0;
		int maxDist = 0;
		for(int i = 0; i < n; i++) {
			int key = sc.nextInt();
			if(map.containsKey(key)) {
				int value = map.get(key);
				if(index < value)	index = value;
				maxDist = Math.max(maxDist,i - index + 1 );
			}else {
				maxDist = Math.max(maxDist,i - index + 1 );
			}
			map.put(key, i + 1);
		}
		System.out.println(maxDist);
	}
}
