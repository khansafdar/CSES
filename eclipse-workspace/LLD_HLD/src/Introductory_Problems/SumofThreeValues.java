package Introductory_Problems;
import java.util.*;
public class SumofThreeValues {

	static class pair{
		int val,index;
		pair(int val, int index){
			this.val = val;
			this.index = index;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pair nums[] = new pair[n];
		int x = sc.nextInt();		
		for(int i = 0; i < n; i++) {
			int val = sc.nextInt();
			pair np = new pair(val, i + 1);
			nums[i] = np;
		}
		if(n < 3) {
			System.out.println("IMPOSSIBLE");
		}
		Arrays.sort(nums, (a, b) -> {
			return a.val - b.val;
		});
		
		for(int i = 0; i < n - 2; i++) {
			int temp = x;
			temp -= nums[i].val;
			int j  = i + 1;
			int k = n - 1;
			while(j < k) {
				int rem = temp - (nums[j].val + nums[k].val);
				if(rem == 0) {
					System.out.println(nums[i].index + " "+nums[j].index + " "+ nums[k].index);
					return;
				}else if(rem > 0) {
					j += 1;
				}else {
					 k -= 1;
				}
			}
		}
		System.out.println("IMPOSSIBLE");
	}
}
/*
4 8
2 7 5 1

after sort ->
 1 2 5 7
 
 * */






