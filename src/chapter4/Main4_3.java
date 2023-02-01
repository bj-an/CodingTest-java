package chapter4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main4_3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		ArrayList<Integer> answer= new ArrayList<Integer>();
		HashMap<Integer, Integer> HM = new HashMap<>();
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<m-1; i++) {
			HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
		}
		int lt=0;
		for(int rt=m-1; rt<n; rt++) {
			HM.put(arr[rt], HM.getOrDefault(arr[rt], 0)+1);
			answer.add(HM.size());
			HM.put(arr[lt], HM.get(arr[lt])-1);
			if(HM.get(arr[lt])==0) HM.remove(arr[lt]);
			lt++;
		}
	    
		System.out.println(answer.toString().replaceAll("[^0-9 ]",""));
		
	}
}
