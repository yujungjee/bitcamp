package week2_1;

public class D0702 {
	public static void main(String[] args) {
		Project p = new HrProject("HR 프로젝트", "20190101", "20191231","서울");
		Developer p1 = new Developer("홍길동",10);
		Developer p2 = new Developer("김길동",15);
		HighDeveloper p3 = new HighDeveloper("김고급",12,"Java");
		p.join(p1);
		p.join(p2);
		p.join(p3);
		p.printDeveloper();
		System.out.println("프로젝트 총 Resource: " +p.getMMByDeveloper());
		
		p.process();
//		System.out.println(p.getPeriod());


	}
}

abstract class Project{
	private String name, startDt, endDt, location;
	private Developer[] dev = new Developer[5];
	private int idx;

	Project(String name, String startDt, String endDt, String location){
		this.name = name;
		this.startDt = startDt;
		this.endDt = endDt;
		this.location = location;
	}


	Project(String name, String startDt, String endDt, String location,
			Developer[] dev){
		this.name = name;
		this.startDt = startDt;
		this.endDt = endDt;
		this.location = location;
		this.dev = dev;
	}


	// 아래 3개의 함수를 차례로 호출
	// plan(), design(), develop()
	public void process() {
		this.plan();
		this.design();
		this.develop();
	}
	public void plan() {
		System.out.println("Project 준비");
	}

	// Proejct에 개발자 Add
	public void join(Developer d) { 
		dev[idx] = d;
		idx++;
	}
	public abstract void design();
	public abstract void develop();

	// startDt와 endDt의 날짜차이를 리턴, getTimeInMillis()이용
	// public int getPeriod();
	// Project에 참여한 개발자의 총 월간 개월수
	public int getMMByDeveloper() {
		int sum = 0;
		for(int i = 0; i<idx; i++) { // 향상된 for문으로
			sum+= dev[i].getPeriod();
		}
		return sum;
	}



	// 고급개발자인 경우 ‘고급개발자’로 출력하고 특기표시
	// 일반개발자 홍길동
	// 일반개발자 김길동
	// 고급개발자 김고급/특기 java
	public void printDeveloper() {
		for(int i=0; i<idx; i++) {
			if(dev[i] instanceof HighDeveloper) {
				System.out.println("고급개발자" + dev[i].getName() + "/ 특기:" + ((HighDeveloper)dev[i]).getSpecialSkill());
			} else {
				System.out.println("일반개발자" + dev[i].getName());
			}
		}
	}
}


class HrProject extends Project{

	HrProject(String name, String startDt, String endDt, String location) {
		super(name, startDt, endDt, location);
	}

	public void design() {
		System.out.println("HR 설계작업수행");
	}
	public void develop() {
		System.out.println("HR 개발작업수행");		
	}


}

class Developer{
	private String name;
	private int period;

	Developer(String name, int period) {
		this.name = name;
		this.period = period;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}
//	public String toString() {
//		return "일반개발자" + getName();
//	}

}


class HighDeveloper extends Developer{
	private String specialSkill;

	HighDeveloper(String name, int period, String specialSkill) {
		super(name, period);
		this.specialSkill = specialSkill;
	}

	public String getSpecialSkill() {
		return specialSkill;
	}

	public void setSpecialSkill(String specialSkill) {
		this.specialSkill = specialSkill;
	}

//	public String toString() {
//		return "고급개발자" + getName() + "/" + "특기" + getSpecialSkill();
//	}

}

