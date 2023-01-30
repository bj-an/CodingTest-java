package chapter2;

import java.util.Scanner;

class Main2_10 {	
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n =sc.nextInt();
	int[][] arr= new int[n][n];
	int answer=0;
	int[] dx = {-1,0,1,0}; //탐색 기준이될 행
	int[] dy = {0,1,0,-1}; //탐색 기준이될 열
	
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
			arr[i][j] = sc.nextInt();
			}
		}
		 
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				boolean flag=true; //봉우리인지 판별하는 변수
				for(int k=0; k<4; k++) {
					int nx=i+dx[k]; //행좌표
					int ny=j+dy[k]; //열좌표
					if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]) {
						flag=false;
						break;
					}
				}
				if(flag) answer++;
				
				
			}
		}
	
	System.out.println(answer);
	
	}
}