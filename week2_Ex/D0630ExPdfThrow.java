package week2_Ex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;


public class D0630ExPdfThrow {
	public static void main(String[] args) {
		D0630ExPdfThrow ex = new D0630ExPdfThrow();
		ex.test2();
	}
	
	public void test1() {
		boolean append = false;
		int i, len = 0;
		String strFile01 = "C:/MyProject/workspace/JavaStudy/HashSetLotto.java";
		String strFile02 = "C://MyProject/workspace/JavaStud/fileStreamTest.txt";
		
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream(new File(strFile01));
			out = new FileOutputStream(strFile02, append);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void test2() {
		Apple[] cats = new Apple[10];
		try {
//		System.out.println(cats[11].name); // IndexOutOfBoundsException
//		System.out.println(cats[0].name); // NullPointerException
		
			   //System.out.println(cats[11].name); // IndexOutOfBoundsException
			   System.out.println(cats[0].name); // NullPointerException
			  } catch (IndexOutOfBoundsException e) {
			   //System.out.println(e.getMessage());
			   e.printStackTrace(); // log에 error를 표시해 준다
			  } catch (NullPointerException e) {
			   //System.out.println(e.getMessage());
			   e.printStackTrace(); // log에 error를 표시해 준다
			  } final {
			   System.out.println("finally 호출");
			  }
	}
}

class Apple{
	String name;
	int age;
	public Apple(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
