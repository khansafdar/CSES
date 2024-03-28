package Introductory_Problems;
import java.util.*;
public class Repetitions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int l = input.length();
		int maxCount = 1;
		int count = 1; 
		for(int i = 1; i < l; i++) {
			if(input.charAt(i) != input.charAt(i - 1)) {
				maxCount = Math.max(maxCount, count);
				count =  1;
			}else {
				count += 1;
			}
		}
		maxCount = Math.max(maxCount, count);
		System.out.println(maxCount);
	}
}
