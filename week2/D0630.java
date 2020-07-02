package week2;

public class D0630 {
	public static void main(String[] args) {
		Programmer pro = new Programmer();
		Project proj = new Project();
		proj.setCompany("A회사");
		proj.setMonth(12);
		proj.setName("홍길동");
		pro.addProjectHistory(proj);
				
//				"프로젝트","A",1);
//		Project proj2 = new Project("프로젝트","B",2);
//		Project proj3 = new Project("프로젝트","C",3);
//		Project proj4 = new Project("프로젝트","D",4);
//		pro.addProjectHistory(proj4);
//		pro.addProjectHistory(proj2);
//		pro.addProjectHistory(proj3);
//		pro.addProjectHistory(proj4);
//		pro.printProjectHistory();
//		System.out.println("총 경력:" +pro.getTotalHistory());
		
		
	}
}

class Programmer {
	private String name;
	private int age;
	private Project now; // 현재 진행중인 Project
	private Project[] history = new Project[5]; // Project 이력
	private int ph;
	private int sum;

	Programmer() {
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
			System.out.printf("회사이름: %s, 기간: %s개월%n",history[i].getName(),history[i].getMonth());
		}
	}
	
	String getTotalHistory() {
		for(int i=0; i<ph; i++) {
			sum += history[i].getMonth();
		}
		return String.format("%d년 %d개월",sum/12, sum%12);
	}
	void setTotalHistory(Project[] p) { // 총경력을 설정한다.
		for(int i = 0; i< ph; i++) {
			sum += history[i].getMonth();
		}
	}
}

class Project {
	private String name;
	private int month;
	private String company; // Project 수행중인 회사

	public Project() {
		
	}
	
	public Project(String name, String company, int month) {
		this.name = name;
		this.company = company;
		this.month = month;
	}
	
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
}
