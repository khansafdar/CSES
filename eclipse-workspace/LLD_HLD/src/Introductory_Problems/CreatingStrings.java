package Introductory_Problems;
import java.util.*;
public class CreatingStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str  = sc.nextLine();
		TreeSet<String> set = new TreeSet<String>();
		StringBuilder sb = new StringBuilder(str);
		FindAllString(sb, 0, set);
		System.out.println(set.size());
		for(String x : set) {
			System.out.println(x);
		}
		
	
	}
	public static void FindAllString(StringBuilder s, int index, TreeSet<String>set) {
		if(index == s.length())return;
		char c = s.charAt(index);
		set.add(s.toString());
		for(int  j = index ; j < s.length(); j++) {
			StringBuilder ns = new StringBuilder(s.toString());
			char ch = ns.charAt(j);
			ns.setCharAt(j, c);
			ns.setCharAt(index, ch);
			FindAllString(ns, index + 1 , set);
		}
	}
}
