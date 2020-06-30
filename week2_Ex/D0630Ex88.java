package week2_Ex;

public class D0630Ex88 {
	public static void main(String[] args) {
		A6 ap = new B6();
		ap.aaa();
		ap.bbb();
		// ap.ccc(); // 접근 가능한 멤버는 Data Type에 의해 결정, Compile Error 발생
	}
}

class A6 {
	public void aaa() {
		System.out.println("aaa");
	}
	public void bbb() {
		System.out.println("bbb");
	}
}

class B6 extends A6{
	public void bbb() {
		System.out.println("bbb1");
	}
	
	public void ccc() {
		System.out.println("ccc");
	}
}
