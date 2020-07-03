package week2;

public class D0703 {
	public static void main(String[] args) {
		Army m = new Army("김군인", 30, "상병", "20000101", "20100215");
		Army sub1 = new Army("김군인1", 30, "병장", "20000101", "20100315");
		Army sub2 = new Army("김군인2", 28, "일병", "20000501", "20100315");
		Army sub3 = new SepcialArmy("김군인3", 28, "일병", "19990501", "20100315", 100000);

		m.addArmySub(sub1);
		m.addArmySub(sub2);
		m.addArmySub(sub3);

		m.printSubOverTimePay();
		// System.out.println(m.getThisMMPeriod());
		m.printSub();
		// System.out.println(m.getSubTotalPeriod());

		Army[] sub = new Army[5];
		m.returnSub(sub);

		//		for(int i = 0; i < 3; i++) {
		//			System.out.println(sub[i].getName());
		//		}

	}
}

class Army{
	private String name,grade,strDt,endDt;
	private int age;
	private Army[] sub = new Army[3];

	Army(){

	}

	Army(String name, int age, String grade, String strDt, String endDt){
		this.name = name;
		this.grade = grade;
		this.strDt = strDt;
		this.endDt = endDt;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getStrDt() {
		return strDt;
	}

	public void setStrDt(String strDt) {
		this.strDt = strDt;
	}

	public String getEndDt() {
		return endDt;
	}

	public void setEndDt(String endDt) {
		this.endDt = endDt;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Army[] getSub() {
		return sub;
	}

	public void setSub(Army[] sub) {
		this.sub = sub;
	}

	public void addArmySub(Army sub) {

	}
	// grade별 야근수당 리턴
	// 일병 100,000 / 상병 200,000 / 병장 300,000
	public int getOverTimePayByGrade() {
		int pay = 0;
		if ((this.grade).equals("일병")) {
			pay = 100000;
		} else if((this.grade).equals("상병")) {
			pay = 200000;
		} else if((this.grade).equals("병장")) {
			pay = 300000;
		}
		return pay;
	}


	// 부하별 야근수당을 출력한다.
	// 형식 '{0}의 야근수당은 {1} 입니다'
	// 금액은 3자리마다 ,를 찍어 표시한다.
	public void printSubOverTimePay() {

	}

	// 부하들의 총 근무기간을 월로 리턴한다
	// (월 계산은 일차이/30으로 계산한다)
	//	public int getThisMMPeriod() {

	//	}

	// 부하들 목록을 파라미터 Army[] sub에 리턴한다
	public void returnSub(Army[] sub) {
		this.sub = new Army[sub.length];
		for(int i = 0; i<sub.length; i++) {
			this.sub[i] = sub[i];
		}
	}

	// 부하들을 출력한다.
	// 병장 홍길동 2019-01-01 ~ 2020-12-31
	// 우수 상병 김길동 2018-01-01~2021-05-31
	public void printSub() {
		for(Army data:sub) {
			System.out.printf("%s %s %s ~ %s",data.grade,data.name,data.strDt,data.endDt);
		}
	}
}

class SepcialArmy extends Army{
	private int bonus; // 야근수당에 bonus가 추가된

	SepcialArmy(){

	}

	SepcialArmy(String name, int age, String grade, String strDt, String endDt, int bonus){
		super(name, age, grade, strDt, endDt);
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	




}