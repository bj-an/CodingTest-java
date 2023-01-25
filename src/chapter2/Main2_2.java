package chapter2;

import java.util.Scanner;

public class Main2_2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 1;
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int el = arr[0];
		
		for(int i=0; i<n-1; i++) {

			if(el<arr[i+1]) {
				el = arr[i+1];
				answer++;
			}
		}
		
		
		
		System.out.println(answer);
	}
}
