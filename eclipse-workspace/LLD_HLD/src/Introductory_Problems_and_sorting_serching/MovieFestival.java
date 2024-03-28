package Introductory_Problems;
import java.util.*;
public class MovieFestival {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int dep[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			dep[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		Arrays.sort(dep);
		int i = 1;
		int j =0;
		int count = 1;
		int maxCount = 1;
		while(i < n && j < n) {
			if(dep[j] <= arr[i]) {
				count += 1;
				i += 1;
				j += 1;
			}else {
				i += 1;
			}
			maxCount = Math.max(maxCount, count);
		}
		System.out.println(maxCount);
	}
}
