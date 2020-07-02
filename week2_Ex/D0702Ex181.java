package week2_Ex;

import java.util.Arrays;

public class D0702Ex181 {
	public static void main(String[] args) {
		int[] arr = {0,1,2,4,5};
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		int[] arr3 = Arrays.copyOfRange(arr,2,4);
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
//		int[] arr = new int[5];
//		Arrays.fill(arr, 9);
//		
//		int[] arr = {3,2,0,1,4};
//		Arrays.sort(arr);
//		int idx = Arrays.binarySearch(arr, 2);
//		
//		int[]arr = {0,1,2,3,4};
//		int[][] arr2 = {{11,12}, {21,22}};
//		Arrays.toString(arr);
//		Arrays.deepToString(arr2);
//		System.out.println(Arrays.toString(arr));
	}
}
