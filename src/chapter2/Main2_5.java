package chapter2;

import java.util.Scanner;

public class Main2_5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	
		int n = sc.nextInt();
		int ch[] = new int[n+1];
		int answer =0;
		
		for(int i=2; i<n; i++) {
			if(ch[i] ==0) {
				answer ++;
				
				for(int j=i; j<=n; j =j+i) ch[j] =1;
			}
		}
		
		
		System.out.println(answer);
	}
}
