package week2_Ex;

public class D0630ExPdfInterface {
	public static void main(String[] args) {
		Person[0] = new Korean[2];
		pers[0] = new Korean("홍길동", 28);
		pers[1] = new American("Tom", 29);

		for(Person P:pers) {
			p.work();
			p.talk();
		}
	}
}

abstract class Person{
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void work() {
		System.out.println("걷는다");
	}
	public abstract void talk();
}

class Korean extends Person{
	public Korean(String name, int age) {
		super(name, age);
	}

	@Override
	public void talk() {
		System.out.println("한국말 한다");

	}
}

class American extends Person{
	public American(String name, int age) {
		super(name,age);
	}

	@Override
	public void talk() {
		System.out.println("미국말 한다");
	}
}

//public class InterfaceTest6{
//	public static void main(String[] args) {
//		Race[] rs = new Race[2];
//		rs[0] = new Korean2("홍길동", 28);
//		rs[1] = new American2("Tom", 29);
//		
//		for(Race r : rs) {
//			System.out.println(r.getRace());
//		}
//	}
//}
//
//interface Race{
//	public abstract String getRace();
//}