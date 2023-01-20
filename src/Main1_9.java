import java.util.Scanner;

public class Main1_9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		str = str.toUpperCase().replaceAll("[A-Z]", "");
		int str2= Integer.parseInt(str);
		System.out.println(str2);
	}
}
  