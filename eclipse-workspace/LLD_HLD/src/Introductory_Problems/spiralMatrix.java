package Introductory_Problems;
import java.util.*;
public class spiralMatrix {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();
			long ans = -1;
			long start = System.currentTimeMillis();
			while(t-- > 0){
			    long i = sc.nextInt();
			    long j = sc.nextInt();
			    long maxi = Math.max(i, j);
			    long square = (maxi - 1) * (maxi - 1);
			    long currentSquare = maxi * maxi;
			    if(maxi % 2 == 0) {
			    	if(i > j) {
			    		System.out.println(currentSquare - j + 1);
			    	}else {
			    		System.out.println(square + i);
			    	}
			    }else {
			    	if(i > j) {
			    		System.out.println(square + j);
			    	}else {
			    		System.out.println(currentSquare - i + 1);
			    	}
			    }
			    long end = System.currentTimeMillis();
			    System.out.println(end - start);
			}
		}
    }

}
