package chapter3;

import java.util.Scanner;

public class Main3_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] a= new int[n];
		int sum=0;
		int answer=0;
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0; i<m; i++) {
			sum+=a[i];
		}
		answer =sum;
		for(int i=m; i<n; i++) {
			sum+=a[i]-a[i-m];
			if(answer<sum) {
				answer=sum;
			}
		}
		System.out.println(answer);
		
	}
}
