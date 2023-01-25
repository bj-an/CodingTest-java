package chapter2;

import java.util.Scanner;

public class Main2_1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int cnt = sc.nextInt();
		int arr[] = new int[cnt];
		String answer="";
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		answer+= String.valueOf(arr[0]+" ");
		
		for(int i=0; i<arr.length; i++) {
			if(i == arr.length-1) break;
			if(arr[i]<arr[i+1]) 
				answer +=String.valueOf(arr[i+1]+" ");
			
		}
		System.out.println(answer);
	}
}
