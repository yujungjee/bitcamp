package week2_Ex;

import java.util.Random;

public class D0701Ex136 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] number = new int[100];
		int[] counter = new int[10];

		for(int i=0; i<number.length; i++) {
//			System.out.println(number[i]=(int)(Math.random()*10));
			System.out.println(number[i] = rand.nextInt(10));
		}
		System.out.println();

		for(int i=0; i<number.length; i++) {
			counter[number[i]]++;
		}
		for(int i=0; i<counter.length; i++) {
			System.out.println(i+"의 개수:" +printGraph('#',counter[i])+""+counter[i]);

		}
	}
	public static String printGraph(char ch, int value) {
		char[] bar = new char[value];
		
		for(int i=0; i<bar.length; i++) {
			bar[i] = ch;
		}
		return new String(bar);
	}
	
}
