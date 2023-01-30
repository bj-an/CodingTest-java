package chapter2;

import java.util.Scanner;

class Main2_7 {	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		int answer = 0;
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			if (arr[i] ==1) {
				cnt++;
				answer+=cnt;
			}
			else cnt=0;
		}
		
		System.out.println(answer);
	}

		

}