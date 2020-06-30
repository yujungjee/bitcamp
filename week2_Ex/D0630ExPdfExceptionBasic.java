package week2_Ex;

public class D0630ExPdfExceptionBasic  {
	 public static void main(String[] args) throws Exception {
	  // 1. JVM이 오류를 인지하여 Exception발생
//	  Dog[] ds = new Dog[10];
//	  ds[0].work(); 
	  
	  // 2. JVM이 오류를 인지하여 Exception발생: try~catch로 잡음
	  
	  Dog3[] ds = new Dog3[10];
	  try {
	   ds[0].work();
	  }catch(Exception e) {
	   System.out.println(e.getMessage());
	   //e.printStackTrace(); // log에 error를 표시해 준다
	  }finally {
	   System.out.println("finally 호출");
	  }
	  
	  
	  // 3. Programmer가 Exception을 발생
	  
//	  Dog3 d = new Dog3("낙동", 5);
//	  try {
//	   d.call();d.call();
//	   if(d.getCallCnt() > 1) {
//	    throw new Exception("조심하세요");
//	   }
//	  }catch(Exception e) {
//	   System.out.println(e.getMessage());
//	   e.printStackTrace(); // log에 error를 표시해 준다
//	  }finally {
//	   System.out.println("finally 호출");
//	  }
	  
	  // 4. 함수가 발생시킨 Exception을 잡음
	  
	  Dog3 d = new Dog3("낙동", 5);
	  try {
	   d.eat();d.eat();d.eat();
	  }catch(Exception e) {
	   System.out.println(e.getMessage());
	   e.printStackTrace(); // log에 error를 표시해 준다
	  }finally {
	   System.out.println("finally 호출");
	  }
	  */
	  
	  // 5. 받은 Exception을 내가 처리하지 않고 throws처리
	  /*
	  Dog d = new Dog("낙동", 5);
	  d.eat();d.eat();d.eat();
	  
	 }
	}


	class Dog3{
	 private String name;
	 private int age;
	 private int callCnt, eatCnt;
	 
	 public Dog3(String name, int age) {
	  this.name = name;
	  this.age = age;
	 }
	 
	 public int getCallCnt() {
	  return callCnt;
	 }
	 
	 public void work() {
	  System.out.println("걷는다");
	 }
	 
	 public void call() {
	  callCnt++;
	  System.out.println("멍멍");
	 }
	 
	 public void eat() throws Exception{
	  if(++eatCnt > 2) {
	   throw new Exception("더 먹으면 안되~");
	  }
	  System.out.println("먹는다");
	 }
	}