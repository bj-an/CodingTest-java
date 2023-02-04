package chapter4;

import java.util.HashMap;
import java.util.Scanner;

public class Main4_2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		HashMap<Character,Integer> map = new HashMap<>();
		String answer="YES";
		
		for(char x: a.toCharArray()) {
			map.put(x, map.getOrDefault(x,0)+1);
		}
		for(char x: b.toCharArray()) {
			if(!map.containsKey(x) || map.get(x) == 0) {
				answer="NO";
				break;
			}
			map.put(x, map.get(x)-1);
		}
		System.out.println(answer);
	}
}
