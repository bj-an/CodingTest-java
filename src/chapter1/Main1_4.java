package chapter1;
import java.util.Scanner;

public class Main1_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String str= "";
		String answer[]= new String[count];
		
		for(int i=0; i<count; i++) {
			str = sc.next();
			answer[i] = new StringBuffer(str).reverse().toString();

		}
		for(int j=0; j<count; j++) {
			System.out.println(answer[j]);
		}
		
		
	}
}
