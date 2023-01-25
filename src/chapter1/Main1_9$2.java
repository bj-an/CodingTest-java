package chapter1;
import java.util.Scanner;

public class Main1_9$2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int answer = 0;
		char strArr[] =str.toCharArray();
		
		for(char x : strArr) {
			if(x>=48 && x<=57) answer=answer*10+(x-48);
			////누적결과값 = 결과값 * 10 (숫자를 찾을수록 자릿수가 늘어나므로) + ( x - 아스키코드로 계산하기떄문에 48부터 시작이라 -48)
		}
		System.out.println(answer);
		
	}
}
  