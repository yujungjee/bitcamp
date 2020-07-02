package week2;


public class D0701_2 {
	public static void main(String[] args) {
		Animation animation = new Animation("A","B",1);
		Science science = new Science("C","D",2);
		Science science2 = new Science("E","F",3);
		System.out.println(animation);
		System.out.println("연체료: "+animation.getLate(7)+"원");
		if(science.equals(science2)) {
			System.out.println("같은 책입니다.");
		} else {
			System.out.println("다른 책입니다.");
		}
	}
}

abstract class Book {
	int number;
	String title;
	String authour;

	Book(){

	}
	Book(String title, String author, int number){
		this.title = title;
		this.authour = author;
		this.number = number;
	}

	abstract int getLate(int day);

	public String toString() {
		return String.format("[관리자번호: %d 제목: %s 저자: %s]%n", number, title, authour);
	}
	public boolean equals(Object obj) { //equlas 오버라이딩
		if(obj!=null && obj instanceof Book) { 
			// obj(참조변수) instanceof Book(피연산자/타입/클래스명)
			// instanceof 연산자를 이용해서 참조변수 obj가 가르키는 인스턴스 타입을 체크하고,
			// 실제 인스턴스와 같은 타입의 참조변수로 형변환을 해야만 인스턴스의 모든 멤버를 사용할 수 있다.
			// 연산결과가 true라면 참조변수가 검사한 타입으로 형변환이 가능하다. (즉,Book으로 형변환이 가능!)
			return number == ((Book)obj).number;
			//((Book)obj).number 조상타입의 참조변수를 인스턴스와 같은 타입의 참조변수로
			// 형변환을 해야 인스턴스 멤버 사용이 가능
		} else {
			return false;
		}
	}
}
class Animation extends Book{
	Animation(String title, String author, int number){
		super(title, author, number);
	}

	@Override
	int getLate(int day) {
		int fee = 100; // 기본 연체료
		fee += day*300; // Animation 연체료 300원
		return fee;
	}
}

class Science extends Book{
	Science(String title, String authour, int number){
		super(title, authour, number);
	}

	@Override
	int getLate(int day) {
		int fee = 100; // 기본 연체료
		return fee += day * 200; // Science 연체료 200원
	}
}
