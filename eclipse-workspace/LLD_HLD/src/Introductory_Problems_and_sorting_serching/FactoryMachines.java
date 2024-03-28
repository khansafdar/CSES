package Introductory_Problems;
import java.util.*;
public class FactoryMachines {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long t = sc.nextLong();
		long low  = 0;
		long high = (long)1e18;
		long time[] = new long[n];
		for(int i = 0; i < n; i++) {
			time[i] = sc.nextLong();
		}
		long ans = -1;
		while(low <= high) {
			long mid = low + (high - low)/2;
			if(isValid(time, mid, t)) {
				ans = mid;
				high = mid - 1;
			}else low = mid + 1;
		}
		System.out.println(ans);
	}
	public static boolean isValid(long time[], long mid, long product) {
		long totalProduct = 0;
		for(int i = 0; i < time.length; i++) {
			totalProduct += (mid / time[i]);
			if(totalProduct > product)break;
		}
		 if(totalProduct >= product)return  true;
		 return false; 
	}
}
