package chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int m= sc.nextInt();
		int[] arr2=new int[m];
		for(int i=0; i<m; i++) {
			arr2[i] = sc.nextInt();
		} 
		Arrays.sort(arr2);
		int p1=0, p2=0;
		ArrayList<Integer> answer = new ArrayList<>();
		
		while(p1<n &&  p2<m) {
			if(arr[p1] == arr2[p2]){
				answer.add(arr[p1++]);
				p2++;
			}
			else if(arr[p1]<arr2[p2]) p1++;
			else p2++;
		}
		
		for(Integer i: answer) {
			System.out.print(i+" ");
		}
	}
}
