package chapter5;

import java.util.Scanner;
import java.util.Stack;

public class Main5_3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int[][] board = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				board[i][j]= sc.nextInt();
			}
		}
		int m = sc.nextInt();
		int[] moves = new int[m];
		for(int i=0; i<m; i++) moves[i] = sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		int answer=0;
		
		
		for(int pos : moves) {
			for(int i=0; i<board.length; i++) {
				if(board[i][pos-1] !=0) {// 인형 탐색
					int tmp=board[i][pos-1]; //인형 발견시 넣어둘 바구니
					board[i][pos-1]=0; //인형이 있던곳
					
					if(!stack.isEmpty() && tmp==stack.peek()) { //같은 인형이면 깨야됨
						answer+=2;
						stack.pop(); //원래인형을 넣지않고 있던 인형만 빼주기
					}
					else stack.push(tmp); //같은 인형이 아니라면 그냥 쌓아두기
					break; // **중요 / break처리 안하면 아까 뽑았던 열에서 인형을 계속 탐색함
				}
			}
		}
		System.out.println(answer);
		
		
		
	}
}
