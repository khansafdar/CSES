package Introductory_Problems;
import java.util.*;
public class SumofFourValues {

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
		int x = sc.nextInt();
		pair nums[] = new pair[n];
		for(int i = 0; i < n; i++) {
			pair np = new pair(sc.nextInt(), i + 1);
			nums[i] = np;
		}
		if(n < 4)System.out.println("IMPOSSIBLE");
		Arrays.sort(nums, (a, b) -> {
			return a.val - b.val;
		});
		for(int i = 0; i < n - 3; i++) {
			int temp1 =x - nums[i].val;
			for(int j = i + 1; j < n - 2; j++) {
				int temp2 = temp1 - nums[j].val;
				int low = j + 1;
				int high = n - 1;
				while(low < high) {
					int temp3 = temp2 - (nums[low].val + nums[high].val);
					if(temp3 == 0) {
						System.out.println(nums[i].index +" "+nums[j].index +" "+nums[low].index +" "+nums[high].index);
						return;
					}else if(temp3 > 0) {
						low += 1;
					}else {
						high -= 1;
					}
				}
			}
		}
		System.out.println("IMPOSSIBLE");
		
	}
}
/*
8 15
3 2 5 8 1 3 2 3


8 6
4 3 1 3 2 1 4 2
after sorting
1 1 2 2 3 3 4 4 -> sum  =6
i j l         h -> sum = 6 , 



*/






