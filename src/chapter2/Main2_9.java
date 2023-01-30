package chapter2;

import java.util.Scanner;

class Main2_9 {	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int answer=0;
		int sum1, sum2;
		//sum1 행 합 sum2 열 합
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		
		for(int i=0; i<n; i++) {
			sum1=sum2=0;
			for(int j=0; j<n; j++) {
				sum1+=arr[i][j]; //행 합
				sum2+=arr[j][i]; // 열 합
			}//안쪽for
			answer=Math.max(answer, sum1);
		    answer=Math.max(answer, sum2);
		}//바깥for
		
		sum1 =sum2=0;
		for(int i=0; i<n; i++) {
			sum1+=arr[i][i]; //오른쪽위로 뻗는 대각선 '/'
			sum2+=arr[i][n-i-1]; //왼쪽아래로 뻗는 대각선 '\'
		}
		answer=Math.max(answer, sum1);
		
		System.out.println(answer);
	}
}