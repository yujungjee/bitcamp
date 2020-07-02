package week2;

public class D0701 {
	public static void main(String[] args) {
		Mother mother = new Mother("엄마", 30);
		Child c1 = new Child("길동", 8);
		Child c2 = new Child("유신", 16);
		c1.setHobby("축구,농구,배구");
		c2.setHobby("축구,농구,족구");
		Child[] childs = {c1,c2};
		mother.goToShool();
		mother.setChilds(childs);
		mother.callChild();
		c1.goToShool();
		c1.fight(c2);
		c2.goToShool();
		c2.fight(c1);
		System.out.println(c2.hobby[1]);
	}
}

class Mother {
	String name;
	int age;
	String job;
	private final int CHLENGTH = 10; // 배열에 있는 값을 final 고정시켜서 가져오는게 좋다
	private Child[] childs;

	public Mother(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Mother(String name, int age, String job, Child[] childs) {
		this(name,age);
		this.job = job;

	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}


	public Child[] getChilds() {
		return childs;
	}

	public void goToShool() {
		System.out.println("아이들과 학교가다.");
	}

	public void setChilds(Child[] childs) {
		this.childs = new Child[childs.length];
		for(int i=0; i<childs.length; i++) {
			this.childs[i]  = childs[i];
		}
	}

	public void callChild() {
		for(int i=0; i<childs.length; i++) {
			System.out.println(childs[i].getName()+"이 지금 갑니다.");
		}
	}
}


class Child {
	String name;
	int age;
	String[] hobby;

	public Child(String name, int age) {
		hobby = new String[3];
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	public void goToShool() {
		System.out.println("학교가다");
	}

	public void fight(Child c) {
		System.out.println(this.name + "이 " + c.getName()+"과 싸웠습니다.");
	}

	public void setHobby(String hobbys) {
		String[]temp = hobbys.split(",");
		this.hobby = temp;
	}
}
