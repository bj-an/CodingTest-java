package chapter4;

import java.util.*;

public class Main4_5 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int answer= -1;
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int k=j+1; k<n; k++) {
					Tset.add(arr[i]+arr[j]+arr[k]);
				}
			}
		}
		int cnt=0;
		for(int s : Tset) {
			cnt++;
		if(cnt==m) answer = s;
		}
		System.out.println(answer);
	}
}
