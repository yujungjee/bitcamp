//package week2;
//
//import java.util.Scanner;
//
//// 관리자목록
//// 관리자 로그인 (ID, PW)
//// 회원 아이디검색(회원검색)
//// 회원 이름 검색 / 회원메뉴 이동
//// 0. 메인으로 이동 / 나가기
//
//public class D0629Team {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		Admin admins = new Admin();
//		admins.setAdid("Admin");
//		admins.setAdname("코로나119관리자");
//		admins.setAdpassword("admin");
//		Customer[] customers = new Customer[5];
//
//		while(true) {
//			System.out.println("관리자모드");
//			System.out.println("[0.나가기, 1. 회원가입, 2. 로그인, 3. 마이페이지, 4. 상품목록, 5. 장바구니, 6.회원탈퇴");
//			switch(scan.nextInt()) {
//			case 0:
//				System.out.println("종료");
//				break;
//
//			case 1:
//				break;
//
//			case 2:
//				break;
//
//			case 3:
//				break;
//
//			case 4:
//				break;
//
//			case 5:
//				break;
//
//			case 6:
//				break;
//
//			case 7:  //관리자 로그인 (while, switch)
//				System.out.println("[관리자 로그인]");
//				boolean check = false;
//
//				do {
//					System.out.println("ID: ");
//					String a = scan.next();
//
//					if(a.equals(admins.getAdid())) {
//						System.out.println("**관리자 ID가 확인되었습니다.");
//						check = false;
//						break;
//					}
//					System.out.println("아이디가 틀렸습니다. 확인해주세요.");
//					check = true;
//				} while(check);
//
//				do {
//					System.out.println("PW: ");
//					String b = scan.next();
//
//					if(b.equals(admins.getAdpassword())) {
//						System.out.println("**관리자 로그인 성공!");
//						check = false;
//						break;
//					}
//					System.out.println("비밀번호가 틀렸습니다. 확인해주세요.");
//					check = true;
//					break;
//
//				} while(check);
//				System.out.println("[0.종료 1. 재고확인, 2. 회원목록, 3. 회원아이디검색]");
//
//				switch(scan.nextInt()) {
//				case 0:
//					System.out.println("종료");
//					break;
//				case 1:
//					System.out.println("[재고확인]");
//					break;
//				case 2:
//					break;
//				case 3:
//					boolean check1 = false;
//
//					do {
//						System.out.println("[회원아이디검색]");
//						System.out.println("회원아이디를 입력하세요.>>");
//						String c = scan.next();
//
//						for(Customer d : customers) {
//							if(d!=null && c.equals(d.getCusid())) {
//								System.out.println("회원이름: " +d.getCusname());
//								System.out.println("전화번호: " +d.getCusnumber());
//								check1 = true;
//								break;
//							}
//						}
//						if(!check1) {
//							System.out.println("회원이 아닙니다.");
//						}
//					}while(!check1);
//
//				}
//			default:
//				break;
//
//			}
//		}
//	}
//}
//
//class Customer1{
//	private String cusname;
//	private String cusid;
//	private String cuspassword;
//	private String count;
//	private String cusnumber;
//
//	public Customer1() {
//
//	}
//
//	public Customer1(Customer cus) {
//		this.cusname = cus.cusname;
//		this.cusid = cus.cusid;
//		this.cuspassword = cus.cuspassword;
//	}
//
//	public String getCusname() {
//		return cusname;
//	}
//
//	public void setCusname(String cusname) {
//		this.cusname = cusname;
//	}
//
//	public String getCusid() {
//		return cusid;
//	}
//
//	public void setCusid(String cusid) {
//		this.cusid = cusid;
//	}
//
//	public String getCuspassword() {
//		return cuspassword;
//	}
//
//	public void setCuspassword(String cuspassword) {
//		this.cuspassword = cuspassword;
//	}
//
//	public String getCount() {
//		return count;
//	}
//
//	public void setCount(String count) {
//		this.count = count;
//	}
//
//	public String getCusnumber() {
//		return cusnumber;
//	}
//
//	public void setCusnumber(String cusnumber) {
//		this.cusnumber = cusnumber;
//	}
//}
//
//class Admin2{
//	private String adname;
//	private String adid = "Admin";
//	private String adpassword = "admin";
//
//	public Admin2() {
//
//	}
//
//	public Admin2(Admin2 ad) {
//		this.adname = ad.adname;
//		this.adid = ad.adid;
//		this.adpassword = ad.adpassword;
//	}
//
//	public String getAdname() {
//		return adname;
//	}
//
//	public void setAdname(String adname) {
//		this.adname = adname;
//	}
//
//	public String getAdid() {
//		return adid;
//	}
//
//	public void setAdid(String adid) {
//		this.adid = adid;
//	}
//
//	public String getAdpassword() {
//		return adpassword;
//	}
//
//	public void setAdpassword(String adpassword) {
//		this.adpassword = adpassword;
//	}
//}