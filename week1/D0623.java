package week1;

import java.util.Scanner;

/*
 * •실습2: 급여계산하기
 * - 입력:기본급, 직책(사원/대리/과장/부장)
 * - 출력:실수령액 =xxx원
 * 
 * 계산식은 다음과 같다.
 * - 실수령액 = 기본급 +직책수당 – 세금
 * - 세금 = 기본급의 10%
 * 직책 수당표

 * - 과장: 200,000
 * - 부장: 500,000
 * 
 */
public class D0623 {
	Scanner input = new Scanner(System.in);
	System.out.println("기본급:");
	int basic = input.nextInt();

	System.out.println("직책:");
	String position = input.next();
	int gradePay = 0;
	switch(position) {
	case "과장":
	 gradePay = 200000;
	 break;
	case "부장":
	 gradePay = 500000;
	 break;   
	}

	int tax = (int)(basic * 0.1);
	int pay = basic + gradePay - tax;
	System.out.println("당신의 실수령액은 " + pay);

}

