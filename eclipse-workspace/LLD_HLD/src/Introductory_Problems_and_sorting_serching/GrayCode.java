package Introductory_Problems;
import java.util.*;
public class GrayCode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		ArrayList<StringBuilder> res = new ArrayList<StringBuilder>();
		res.add(new StringBuilder(""));
		for(int  i = 0; i < n; i++) {
			for(int  j = res.size() - 1; j >= 0; j--) {
				res.add(new StringBuilder(res.get(j)));
			}
			for(int j = 0; j < res.size(); j++) {
				if(j  < res.size()/2) {
					res.get(j).append("0");
					
				}else {
					res.get(j).append("1");
				}	
			}
		}
		for(int  i = 0 ; i < res.size() ; i++) {
			System.out.println(res.get(i).toString());
		}
	}
}
