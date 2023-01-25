package chapter1;
import java.util.Scanner;

public class Main1_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int lt = 0;
		int rt = str.length()-1;
		
		str = str.toUpperCase();
		char[] s = str.toCharArray();
		
		while(lt<rt) {
			if(!(s[lt] ==s[rt])) {
				System.out.println("NO");
				break;
			}
				lt++;
				rt--;
			if(!(lt<rt))
				System.out.println("YES");
		}
	}
}
  