package Introductory_Problems;
import java.util.*;
public class weirdNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        while(n != 1 && n > 0){
            System.out.print(n +" ");
            n = (n%2 == 1)? n*3 + 1 : n/2;
        }
        System.out.print(1);
	}
}
