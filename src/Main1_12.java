import java.util.Scanner;

class Main1_12{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		String answer = "";
		
		for( int i = 0; i<n; i++) {
			String tmp = str.substring(0,7).replace('#','1').replace('*', '0');
			int num = Integer.parseInt(tmp, 2);
			answer += (char)num;
			str=str.substring(7);
			
		}
		System.out.println(answer);
	
	
	
	
	}
}