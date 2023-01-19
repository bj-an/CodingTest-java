import java.util.Scanner;

public class Main1_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String answer= "";
		
		for(int i=0; i<str.length(); i++) {
		//	System.out.println(str.charAt(i)+" " + i + " " + str.indexOf(str.charAt(i)));
		//  indexOf = ()안에 있는 파라미터의 최초 등장 주소값을 반환 -> 주소값과 indexof의 값이 같으면 최초등장 = 중복이아님
			if(str.indexOf(str.charAt(i)) ==i) answer +=str.charAt(i);
			
		}
		System.out.println(answer);
	}
}
  