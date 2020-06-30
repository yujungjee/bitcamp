package week2_Ex;

// Interface 교재 p.96 예제

interface interA2 {
	void aaa();
	public abstract void bbb();
}

class interB2 implements interA2{
	// A2의 aaa가, public abstract이므로 public으로 지정해야 함
	// 자식은 부모보다 넓은 접근제한자를 가져야 한다.
	
	public void aaa() {
		System.out.println("aaa 메서드");
	}

	public void bbb() {
		System.out.println("bbb 메서드");
	}
}
public class D0630Ex96 {
	public static void main(String[] args) {
		interA2 ap = new interB2();
		ap.aaa();
		ap.bbb();
	}

}
