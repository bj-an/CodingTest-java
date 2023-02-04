package chapter5;

import java.util.Scanner;
import java.util.Stack;

public class Main5_5 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str = sc.next();
		int answer =0;
		Stack<Character> stack = new Stack<>();
		
		
		for(int i=0; i<str.length(); i++) {
			if (str.charAt(i)=='(') stack.push('(');
			else {
				stack.pop();
				if(str.charAt(i-1)=='(') answer+=stack.size();
				else answer++;
			}
		}
		
		System.out.println(answer);
		
		
		
		
		
	}
}
