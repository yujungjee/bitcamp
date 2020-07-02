package week2_Ex;

public class D0702Ex158 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException,
	ClassNotFoundException {


		A a = new B();
		Class c1 = a.getClass();
		System.out.println("class name:" +c1.getName());
		System.out.println("super class name:" +c1.getSuperclass());
		B b = (B)(c1.newInstance());
//		construtor construtor = c1.getConstructor(null);
//		B b = (B)construtor.newInstance();
		b.m2();
		Class c2 = Class.forName("week2_Ex.B");
		((A) c2.newInstance()).m();
		System.out.println("abc".getClass().getName());

	}
}

class A { 
	public int i;
	public A() {
		System.out.println("A생성자");
	}
	public void m() {
		System.out.println("A.m()");
	}
}

class B extends A{
	public B() {
		System.out.println("B생성자");
	}
	public void m() {
		System.out.println("B.m()");
	}
	public void m2() {
		System.out.println("B.m2()");
	}
}
