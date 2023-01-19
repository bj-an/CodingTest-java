import java.util.Scanner;

public class Main1_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m = -1;
		String str = sc.nextLine();
		String arr[] = str.split(" ");
		String answer = "";
		for(String x : arr) {
			int len = x.length();
			if(len>m) {
				m=len;
				answer=x;
			}
		}
		
		System.out.println(answer);
	}
}
