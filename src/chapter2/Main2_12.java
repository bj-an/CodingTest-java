package chapter2;

import java.util.Scanner;

class Main2_12 {	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt(); 
	int m=sc.nextInt();
	                    
	/**
	n=학생수 
	m=시험수 
	k=(등수를 비교하기위한) 테스트수  
	s=(등수를 비교하기위한) 사람수 
	pi=(해당테스트의)i번학생의 등수
	pj=(해당테스트의)j번째 학생의 등수
	
	cnt = 해당학생들의 멘토멘티 판별기준
	cnt == m =>모든테스트에서 멘토멘티의 기준을 통과했다 -> answer++
	**/
	
	
	int cnt=0;
	int[][] arr = new int[m][n];
	int answer=0;
	
	for(int i=0; i<m; i++) {
		for(int j=0; j<n; j++) {
			arr[i][j] = sc.nextInt();
		}
	}
	
	for(int i=1; i<=n; i++) {
		for(int j=1; j<=n; j++) {
			cnt=0;
			for(int k=0; k<m; k++) {
				int pi=0, pj=0;
				for(int s=0; s<n; s++) {
					if(arr[k][s] ==i) pi =s;
					if(arr[k][s] ==j) pj =s;
				}
				if(pi<pj) cnt++;
			}
			if(cnt==m) {
				answer++;
			}
		}
	}
	
	System.out.println(answer);
	
	

	}
}