package chapter2;

import java.util.Scanner;

class Main2_8 {	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr= new int[n];
		int rank =1;
		int[] answer = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] =sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			rank = 1;
			for(int j=0; j<n; j++) {
				if(arr[i]<arr[j]) {
					rank++;
				}
				answer[i]=rank;
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(answer[i] + " ");
		}
		
		
	}

		

}