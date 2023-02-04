package chapter5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main5_7 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String need = sc.nextLine();
		String plan = sc.nextLine();
		String answer="YES";
		Queue<Character> Q = new LinkedList<>();
		
		for(char x : need.toCharArray()) Q.offer(x);
		for(char x : plan.toCharArray()) {
			if(Q.contains(x)) {
				if(x!=Q.poll()) {
					answer="NO";
					break;
				}
			}
		}
		if(!Q.isEmpty()) answer= "NO";
		
		System.out.println(answer);
	}
}
