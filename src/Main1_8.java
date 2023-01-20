import java.util.Scanner;

public class Main1_8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equals(tmp)) 
			System.out.println("YES");
		else
			System.out.println("NO"); 
		
		
	}
}
  