package chapter3;

import java.util.Scanner;

public class Main3_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int m =sc.nextInt();
		int[]arr = new int[n];
		int sum=0, answer=0, lt=0;
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int rt=0; rt<n; rt++) {
			sum+=arr[rt];
			if(sum==m) answer++;
			while(sum>=m) {
				sum-=arr[lt++];
				if(sum==m) answer++;
			}
		}
		
		System.out.println(answer);
	}
}
