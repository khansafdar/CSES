package Introductory_Problems;
import java.util.*;
public class PalindromeReorder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int l  = str.length();
		int count[] = new int[26];
		Arrays.fill(count, 0);
		for(int i = 0; i < l; i++) {
			count[str.charAt(i) - 'A'] += 1;
		}
		int oddCount = 0;
		for(int i = 0; i < 26; i++) {
			if(count[i] % 2 == 1)oddCount += 1;
		}
		if(oddCount > 1) {
			System.out.println("NO SOLUTION");
			return;
		}
		StringBuilder sbStart = new StringBuilder("");
		StringBuilder sbEnd = new StringBuilder("");
		StringBuilder sbMid = new StringBuilder("");
		for(int i = 0; i < 26; i++) {
			if(count[i] %2 == 1) {
				while(count[i]-- > 0)
					sbMid.append((char)('A' + i));
			}else {
				while(count[i]-- > 0) {
					if(count[i] % 2 ==0) {
						sbStart.append((char)('A' + i));
					}else {
						sbEnd.append((char)('A' + i));
					}
				}
			}
		}
		sbStart.reverse();
		System.out.println(sbStart.toString() + sbMid.toString() + sbEnd.toString());
	}
}
