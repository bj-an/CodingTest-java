package chapter3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> answer = new ArrayList<>();
		int n= sc.nextInt();
		int[] arr = new int[n];
		int p1=0,p2=0;
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int m= sc.nextInt();
		int[] arr2 = new int[m];
		for(int i=0; i<m; i++) {
			arr2[i] = sc.nextInt();
		}
		
		while(p1<n && p2<m) {
			if(arr[p1]<arr2[p2]) answer.add(arr[p1++]);
			else answer.add(arr2[p2++]);
		}
		while(p1<n) answer.add(arr[p1++]);
		while(p2<m) answer.add(arr2[p2++]);
		
		for(Integer i : answer) {
			System.out.print(i+" ");
		}
		
	}
}
