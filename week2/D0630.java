package week2;

public class D0630 {

}

class Programmer {
	private String name;
	private int age;
	private Project now; // 현재 진행중인 Project
	private Project[] history; // Project 이력
	private int ph;
	
	Programmer() {
		history = new Project[5];
		ph = 0;
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
	void addProjectHistory(Project p) { 
		// Project History는 5개까지 가능;
		// 5개를 넘게 추가 시 메시지 "Project History는 5개까지 추가 가능합니다."
		if(ph == 5) {
			System.out.println("Project History는 5개까지 추가 가능합니다.");
			return;
		}
		now = p;
		history[ph] = now;
		ph++;
	}
	void printProjectHistory() { // Project경력을 출력한다.
		for(int i = 0; i<ph; i++) {
			System.out.println(history[i].toString());
		}
	}
	void setTotalHistory(Project[] p) { // 총경력을 설정한다.
		history = new Project[5];
		history = p;
	}
	
	public static void main(String[] args) {
		Project[] history = new Project[5];
	} 
	
	
}

class Project {
	private String name;
	private int month;
	private String company; // Project 수행중인 회사
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public static void main(String[] args) {
		Project p = new Project();
		p.setCompany("AA");
		p.setMonth(12);
		p.setName("BB");
		
	}
}
