import java.util.Scanner;

public class Main1_1 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase();
		char c = str.charAt(0);
		System.out.println(c);
		int answer = 0;
		
		
		for(int i=0; i <str.length(); i++) {

			if( str.charAt(i) == c) {
				answer++;
			}
		}
		System.out.println(answer);
	}	
}
