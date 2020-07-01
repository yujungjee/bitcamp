package week2;

import java.util.Random;
import java.util.Scanner;

class Admin {

}

class Product {
	String[] proname = new String[] { "마스크", "손소독제", "위생장갑" };
	int[] procount = new int[] { 100, 100, 100 };
	int[] procnt = new int[] { 100, 100, 100 };
	int[] proprice = new int[] { 1000, 1500, 2000 };

	public String toString() {

		return String.format("- 마스크 재고 %d 개 %n- 손 소독제 재고 %d개 %n- 비닐장갑 재고 %d개");

	}

}

class Customer {

	int cntCustomer;

	public String cusName, cusPhone, cusAdd, cusPassword, cusId;
	boolean state = false;

	String getCusId() {
		return cusId;
	}

	public void setCusId(String cusId) {
		this.cusId = cusId;
	}

	public String getCusPassword() {
		return cusPassword;
	}

	public void setCusPassword(String cusPassword) {
		this.cusPassword = cusPassword;
	}

	public int getCntCustomer() {

		return cntCustomer;

	}

	public void setCntCustomer(int cntCustomer) {

		this.cntCustomer = cntCustomer;

	}

	public String getCusPhone() {

		return cusPhone;

	}

	public void setCusPhone(String cusPhone) {

		this.cusPhone = cusPhone;

	}

	public String getCusName() {

		return cusName;

	}

	public void setCusName(String cusName) {

		this.cusName = cusName;

	}

	public String getCusAdd() {

		return cusAdd;

	}

	public void setCusAdd(String cusAdd) {

		this.cusAdd = cusAdd;

	}

	public String toString() {

		return String.format("--------------------\r아이디: %s, 이름: %s, 주소: %s, 전화번호: %s",cusId, cusName, cusAdd, cusPhone);

	}

}

public class D0629TeamFin {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tmp1 = 0, tmp2 = 0, tmp3 = 0;
		Product product = new Product();
		Customer[] customers = new Customer[100];
		Random random = new Random();
		int count = 0;
		while (true) {
			System.out.println("0.나가기 1.회원가입 2.로그인 3.상품목록 4.장바구니 5.회원탈퇴");
			switch (scanner.nextInt()) {
			case 0:
				System.out.println("나가기");
				return;
			case 1:
				Customer cus = new Customer();
				System.out.println("회원가입");
				boolean bcus = false;
				do {
					System.out.println("아이디를 입력하세요:");
					cus.setCusId(scanner.next());
					for (Customer c : customers) {
						if (c != null && c.getCusId().equals(cus.getCusId())) {
							System.out.println("중복된 아이디 입니다.");
							bcus = true;
							break;
						} else {
							bcus = false;
						}
					}
				} while (bcus);
				System.out.println("이름을 입력하세요:");
				cus.setCusName(scanner.next());
				System.out.println("주소를 입력하세요");
				cus.setCusAdd(scanner.next());
				System.out.println("전화번호를 입력하세요");
				cus.setCusPhone(scanner.next());
				int injeung = random.nextInt(100000) + 1;
				System.out.println(cus.getCusPhone() + "로 문자가 발송되었습니다.");
				System.out.println("발송된 6자리 숫자를 입력해주세요");

				System.out.println(cus.getCusPhone() + "["+injeung+"]");
				System.out.println();
				System.out.println("숫자입력: ");
				int a = scanner.nextInt();
				if (a == injeung) {
					System.out.println("인증되었습니다.");
				}
				else {System.out.println("잘못된 인증번호입니다.");
				break;
			}
				
				System.out.println("비밀번호를 입력하세요:");
				cus.setCusPassword(scanner.next());
				customers[count] = cus;
				count++;
				break;

			case 2:
				cus = new Customer();
				System.out.println("로그인");
				boolean boo = false;
				do {
					System.out.println("아이디를 입력하세요: ");
					cus.setCusId(scanner.next());
					System.out.println("비밀번호를 입력하세요: ");
					cus.setCusPassword(scanner.next());
					for (int i = 0; i < count; i++) {
						if (cus.getCusId().equals(customers[i].getCusId())
								&& cus.getCusPassword().equals(customers[i].getCusPassword())) {
							customers[i].state = true;
							boo = false;
							System.out.println("로그인 성공");
							break; // break없으면 로그인실패로 넘어감
						} 
					}
				} while (boo);
				break;
			case 3:
					System.out.println("상품목록");
					System.out.println("1.마스크 2.손소독제 3.위생장갑");
					switch (scanner.nextInt()) {
					case 1:
						//
						System.out.println(product.proname[0]);
						System.out.println("호흡기를 안전하게 보호합니다.");
						System.out.println("가격 : " + product.proprice[0] + "원");
						System.out.println("재고 : " + product.procount[0] + "개\r");
						System.out.println("1.장바구니에 담기 0.뒤로");
						switch (scanner.nextInt()) {
						case 1:
							if (product.procount[0] > 0) {
								System.out.println(product.proname[0] + " 몇개 담으시겠습니까?");
								tmp1 = scanner.nextInt();
								if (tmp1 <= product.procount[0] && tmp1 > 0) {
									System.out.println(tmp1 + "개 장바구니에 담아졌습니다.\r");
									product.procount[0] = product.procount[0] - tmp1;
									break;
								} else if (tmp1 > product.procount[0]) {
									System.out.println("재고가 부족합니다.\r");
									tmp1 = 0;
									break;
								}
							} else {
								System.out.println("재고가 부족합니다\r");
							}
							break;
						case 0:
							break;
						default:
							break;
						}
						break;
					case 2:
						// product.setGloveCount(product.getGloveCount() - tmp2);
						System.out.println(product.proname[1]);
						System.out.println("99%향균작용으로 손을 소독해보세요!");
						System.out.println("가격 : " + product.proprice[1] + "원");
						System.out.println("재고 : " + product.procount[1] + "개\r");
						System.out.println("1.장바구니에 담기 0.뒤로");
						switch (scanner.nextInt()) {
						case 1:
							if (product.procount[1] > 1) {
								System.out.println(product.proname[1] + " 몇개 담으시겠습니까?");
								tmp2 = scanner.nextInt();
								if (tmp2 <= product.procount[1] && tmp2 > 0) {
									System.out.println(tmp2 + "개 장바구니에 담아졌습니다.\r");
									product.procount[1] = product.procount[1] - tmp2;
									break;
								}
							} else if (tmp2 > product.procount[1]) {
								System.out.println("재고가 부족합니다.\r");
								tmp2 = 0;
								break;
							} else {
								System.out.println("재고가 부족합니다.\r");
							}
						case 0:
							break;
						default:
							break;
						}
						break;
					case 3:
						System.out.println(product.proname[2]);
						System.out.println("당신의 손을 위생적으로 관리하게 해주는 아이템");
						System.out.println("가격 : " + product.proprice[2] + "원");
						System.out.println("재고 : " + product.procount[2] + "개\r");
						System.out.println("1.장바구니에 담기 0.뒤로");
						switch (scanner.nextInt()) {
						case 1:
							if (product.procount[2] > 1) {
								System.out.println(product.proname[2] + " 몇개 담으시겠습니까?");
								tmp3 = scanner.nextInt();
								if (tmp3 <= product.procount[2] && tmp3 > 0) {
									System.out.println(tmp3 + "개 장바구니에 담아졌습니다.\r");
									product.procount[2] = product.procount[2] - tmp3;
									break;
								}
							} else if (tmp3 > product.procount[2]) {
								System.out.println("재고가 부족합니다.\r");
								tmp3 = 0;
								break;
							} else {
								System.out.println("재고가 부족합니다.\r");
								break;
							}
						case 0:
							break;
						default:
							break;
						}
						break;
					}
					break;
			case 4:
				System.out.println("장바구니");
				if (tmp1 == 0 && tmp2 == 0 && tmp3 == 0) {
					System.out.println("장바구니에 담긴 물건이 없습니다");
					break;
				}

				if (tmp1 != 0) {
					System.out.println(product.proname[0] + " : " + tmp1 + "개\r");
					System.out.println(tmp1 * product.proprice[0] + ":원");
				}

				if (tmp2 != 0) {
					System.out.println(product.proname[1] + " : " + tmp2 + " 개\r");
					System.out.println(tmp2 * product.proprice[1] + ":원");
				}

				if (tmp3 != 0) {
					System.out.println(product.proname[2] + " " + tmp3 + "개\r");
					System.out.println(tmp3 * product.proprice[2] + ":원");
				}

				int sum = (tmp1 * product.proprice[0]) + (tmp2 * product.proprice[1]) + (tmp3 * product.proprice[2]);
				System.out.println("총 결제금액: " + sum + "\r");
				if (tmp1 != 0 || tmp2 != 0 || tmp3 != 0) {
					System.out.println("1.결제 2.장바구니 비우기 0.메인메뉴로");
					switch (scanner.nextInt()) {
					case 1:
						System.out.println("총 금액: " + sum + "원 결제하시겠습니까?");
						System.out.println("1.계좌이체 0.메인메뉴");
						switch (scanner.nextInt()) {
						case 1:
							System.out.println("계좌번호 입력");
							String banknum = scanner.next();
							System.out.printf("%s 계좌에서 %s원 결제되었습니다.\r", banknum, sum);
							product.procount[0] = product.procnt[0] - tmp1;
							product.procnt[0] = product.procount[0];
							product.procount[1] = product.procnt[1] - tmp2;
							product.procnt[1] = product.procount[1];
							product.procount[2] = product.procnt[2] - tmp3;
							product.procnt[2] = product.procount[2];
							tmp1 = 0;
							tmp2 = 0;
							tmp3 = 0;
							break;
						default:
							break;
						}
						break;
					case 2:
						System.out.println("담긴 물건을 초기화합니다.\r");
						product.procount[0] = product.procount[0] + tmp1;
						product.procount[1] = product.procount[1] + tmp2;
						product.procount[2] = product.procount[2] + tmp3;
						tmp1 = 0;
						tmp2 = 0;
						tmp3 = 0;
						break;
					case 0:
						break;
					default:
						break;
					}
				}
				break;
			case 5:
				cus = new Customer();

				System.out.println("회원탈퇴");

				boolean bSearch=false;

				Loop: do {

					System.out.println("아이디");

					cus.setCusId(scanner.next());

					System.out.println("비밀번호");

					cus.setCusPassword(scanner.next());

					for (int i = 0; i < count; i++) {

						if (customers[i] != null &&
								customers[i].
								getCusId().
								equals
								(cus.getCusId())&& customers[i].getCusPassword().equals(cus.getCusPassword())) {

							for (int j = i; j < count - 1; j++) {

								customers[j] = customers[j + 1];

							}

							customers[count] = null;

							count--;

							System.out.println("탈퇴 완료 되었습니다.");

							bSearch = true;

							break Loop;

						}

					}

					if(!bSearch) {

						System.out.println("탈퇴 실패 되었습니다.");

						break;

					}

				} while (!bSearch);

 

				break;
			case 6:
				while (true) {

					System.out.println("[관리자 메뉴]");

					System.out.println("0.나가기, 1.재고확인, 2.회원목록, 3.아이디 검색");

					switch (scanner.nextInt()) {

					case 0:

						System.out.println("[관리자 메뉴]를 종료합니다");

						break;

					case 1:

						System.out.println("[관리자 - 재고확인]");
						System.out.println(product.proname[0] + ": " + product.procount[0] + "개");
						System.out.println(product.proname[1] + ": " + product.procount[1] + "개");
						System.out.println(product.proname[2] + ": " + product.procount[2] + "개");
						break;

					case 2:
						System.out.println("[관리자 - 회원목록]");
						for (int j = 0; j < count; j++) {
							System.out.println(customers[j].toString());
						}
						break;
					case 3:
						boolean check1 = true;

						do {
							System.out.println("[회원아이디검색]");
							System.out.println("회원아이디를 입력하세요.>>");
							String c = scanner.next();
							for (int i = 0; i < count; i++) {
								System.out.println(customers[i].getCusId());
								if (customers[i].getCusId().equals(c)) {
									System.out.println("회원이름: " + customers[i].getCusName());
									System.out.println("전화번호: " + customers[i].getCusPhone());
									check1 = false;
									break;
								}
							}
					
						} while (check1);
						break;
					default:
						System.out.println("- 잘못된 입력입니다 -");
						break;
					}
					break;
				}
			default:
				break;
			}
		}
	}
}
