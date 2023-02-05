package chapter6;

import java.util.*;

public class Main6_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();		
		
		String answer = "U";
		Arrays.sort(arr);
		for(int i=0; i<n-1; i++) {
			if(arr[i]==arr[i+1]) answer ="D";
		}
		
		
		System.out.println(answer);
		
		
		
	}
}
