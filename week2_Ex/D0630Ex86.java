package week2_Ex;

// 추상클래스 예제 실습 , p.86 / 카페

public class D0630Ex86 {

	public static void main(String[] args) {
		Animal[] anis = new Animal[2];
		Animal dog = new Dog("먹보",5,"셰퍼드");
		Animal cat = new Cat("쌀쌀이",5,"블루다이아");

		anis[0] = dog;
		anis[1] = cat;

		for(Animal ani:anis) {
			ani.eat();
			ani.sleep();
			ani.dong();
		}
	}
}

abstract class Animal{
	String name;
	int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public abstract void eat();
	public abstract void sleep();
	public abstract void dong();
}

class Dog extends Animal{
	String dogType;

	public Dog(String name, int age, String dogType) {
		super(name,age);
		this.dogType = dogType;
	}

	@Override
	public void eat() {
		System.out.println("Dog 마구 먹는다.");

	}

	@Override
	public void sleep() {
		System.out.println("Dog 잘잔다.");
	}

	@Override
	public void dong() {
		System.out.println("Dog 잘싼다");
	}
}

class Cat extends Animal{
	String catType;

	public Cat(String name, int age, String catType) {
		super(name,age);
		this.catType = catType;
	}

	@Override
	public void eat() {
		System.out.println("Cat 조금 먹는다.");
	}

	@Override
	public void sleep() {
		System.out.println("Cat 잘 설친다.");
	}

	@Override
	public void dong() {
		System.out.println("Cat 변비다.");
	}

}
