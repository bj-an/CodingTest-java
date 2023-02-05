package chapter5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main5_6 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int answer=0;
		Queue<Integer> Q = new LinkedList<>();
		
		for(int i=1; i<=n; i++) Q.offer(i);
		
		while(!Q.isEmpty()) {
			for(int i=1; i<m; i++) Q.offer(Q.poll());
			
			Q.poll();
			if(Q.size()==1) answer=Q.poll();
		}
		System.out.println(answer);

	}
}
