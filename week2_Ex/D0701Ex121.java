package week2_Ex;

import java.util.StringTokenizer;

public class D0701Ex121 {
	public static void main(String[] args) {
//		StringBuffer sb = new StringBuffer("H1");
//		System.out.println(sb);
		
//		StringBuffer sb = new StringBuffer("abd");
//		sb.append("abc");
//		System.out.println(sb);
		
//		StringBuffer sb = new StringBuffer("abc");
//		char c = sb.charAt(2);
//		System.out.println(c);
		
//		StringBuffer sb = new StringBuffer("0123456");
//		StringBuffer sb2 = sb.delete(3,6);
//		System.out.println(sb2);
		
//		StringBuffer sb = new StringBuffer("0123456");
//		char c = sb.deleteCharAt(3);
//		System.out.println(c);
		
//		StringBuffer sb = new StringBuffer("0123456");
//		sb.insert(4, ',');
//		System.out.println();
		
		StringTokenizer st = new StringTokenizer("This \t is \n String");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		System.out.println("======================");
		
		String str = "80::95:70";
		StringTokenizer st2 = new StringTokenizer(str,":",false);
		int i = 0;
		while(st2.hasMoreTokens()) {
			System.out.println(i+":"+st2.nextToken());
			i++;
		}
		System.out.println("======================");
		String[] result = str.split(":");
		for(int x = 0; x<result.length; x++) {
			System.out.println(x+":"+result[x]);
		}
		System.out.println("=====================");
		String str2 = "81-2-010-1234-5678";
		String[] arr2 = str2.split("-",4);
		for(int x=0; x<arr2.length; x++) {
			System.out.println(x+":"+arr2[x]);
		}
		System.out.println("=====================");
		String str3 = "81-2-010-1234-5678-";
		String[] arr3 = str3.split("-",6);
		for(int x =0; x<arr3.length; x++) {
			System.out.println(x+":"+arr3[x]);
		}
	}
}
