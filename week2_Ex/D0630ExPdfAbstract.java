package week2_Ex;

public class D0630ExPdfAbstract {
	public static void main(String[] args) {

	}
}

abstract class Animal1 {
	 public abstract void eat();
	 public abstract void sleep();
	 public abstract void dong();
}

class Dog1 extends Animal1{

	@Override
	public void eat() {
		
		// TODO Auto-generated method stub
		
	} // 에러가 나는 이유, 상속 받았을 때 추상화되어있으면 자식에서는 재정의 해줘야함. / 왼쪽 오류 램프 누르고 재정의할 메소드를 추가할거냐고 묻는데 누르면은
	// 메서드를 자동으로 만들어 준다.
	
}