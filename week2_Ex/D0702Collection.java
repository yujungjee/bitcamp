package week2_Ex;

import java.util.ArrayList;

public class D0702Collection {
	public static void main(String[] args) {
		// 1번 문제
		// 7,5,1,9,3,5,2,8 내림차순
		
//		int[] intArr = {7,5,1,9,3,5,2,8};
//		Arrays.sort(intArr, new Descending());
//		System.out.println("chArr =" +Arrays.toString(intArr));
//	
		// 2번 문제
		// "AB","ef","CK","gt","pb" 내림차순
		
//		String[] strArr = {"AB","ef","CK","gt","pb"};
//		Arrays.sort(strArr, new Descending());
//		System.out.println("strArr=" +Arrays.deepToString(strArr));
		
		// 3번 문제
		// {7,5,10,9,3,5,2,8},{5,10,15,90,7}의 교집합
		
//		int[][] arr = {{7,5,10,9,3,5,2,8},{5,10,15,90,7}};
//		ArrayList list2 = new ArrayList();
//		list2.add(7);
//		list2.add(5);
//		list2.add(10);
//		list2.add(9);
//		list2.add(3);
//		list2.add(5);
//		list2.add(2);
//		list2.add(8);
//		
//		ArrayList list3 = new ArrayList();
//		list3.add(5);
//		list3.add(10);
//		list3.add(15);
//		list3.add(90);
//		list3.add(7);
//		
//		list3.retainAll(list2);
//		System.out.println(list3);
//	}
	
	// 4번 문제
	// {7,5,10,9,3,5,2,8},{5,10,15,90,7}의 합집합을 구하시오.(중복제거)
	int[][] arr = {{7,5,10,9,3,5,2,8},{5,10,15,90,7}};
	ArrayList list2 = new ArrayList();
		list2.add(7);
		list2.add(5);
		list2.add(10);
		list2.add(9);
		list2.add(3);
		list2.add(5);
		list2.add(2);
		list2.add(8);
		
//		ArrayList list3 = new ArrayList();
//		list3.add(5);
//		list3.add(10);
//		list3.add(15);
//		list3.add(90);
//		list3.add(7);
		
		list2.remove(5);
		
		list2.addAll(list2);
		System.out.println(list2);
		
		
	}
	
//	public interface Comparable{
//		public int compareTo()
//	}
}