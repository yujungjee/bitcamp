package week2_Ex;

import java.util.HashSet;


// 로또
public class D0701Ex138 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		java.util.Random ro = new java.util.Random();
		int cnt = 0;
		while(true) {
			int value = ro.nextInt(46);
			if(hs.add(new Integer(value))) {cnt++;}
			if(cnt == 6) break;
		}
		System.out.println(hs);
	}
}
