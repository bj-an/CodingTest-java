package chapter1;
import java.util.Scanner;

public class Main1_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		char ct = t.charAt(0);
		int [] answer = new int[s.length()];
		int p =1000;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == ct) {
				p=0;
				answer[i] = p;
			}
			else {
				p++;
				answer[i] = p;
			}
				
		}
		p = 1000;
		for(int i=s.length()-1; i>=0; i--) {
			if(s.charAt(i) == ct) 
				p=0;
			else {
				p++;
				answer[i] = Math.min(answer[i], p); 
			}
		}
		
		for(int i = 0; i<answer.length; i++) {
			System.out.print(answer[i]+" ");
		}
	}
}
  