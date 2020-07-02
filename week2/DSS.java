
abstract class Book{
	private int num;
	private String title, author;
	Book(){}
	Book(String title, String author, int num){
		this.title = title;
		this.author = author;
		this.num = num;
	}
	abstract int getLateFee(int day);
	public String toString() {
		return String.format("[관리자번호: %d 제목: %s 저자: %s]%n", num, title, author);
	}
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Book) {
			return num ==((Book)obj).num;
		} else {
			return false;
		}
	}
}
class Animation extends Book{

	Animation(String title, String author, int num) {
		super(title, author, num);
	}

	@Override
	int getLateFee(int day) {
		int fee = 100;
		fee += day * 300;
		return fee;
	}

}
class Science extends Book{

	Science(String title, String author, int num) {
		super(title, author, num);
	}

	@Override
	int getLateFee(int day) {
		int fee = 100;	
		return fee += day * 200;
	}
	
}
public class P2 {

	public static void main(String[] args) {
		Animation b = new Animation("d", "감독", 1);
		Science b2 = new Science("책", "저자", 2);
		Science b3 = new Science("책","저자",2);
		System.out.print(b);
		System.out.println(b.getLateFee(5));
		if(b3.equals(b2)) {
			System.out.println("같은 ");
		} else {
			System.out.println("다른 ");
		}
	}

}
