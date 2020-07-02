package week2_Ex;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class D0702Ex160 {
	public String str;
	public D0702Ex160(String str) {
		this.str = str;
		System.out.println("REFLECT 생성자호출:" +str);
	}


	public static void main(String[] args) throws ClassNotFoundException, SecurityException, 
	NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {

		Class c = Class.forName("week2_Ex.D0702Ex160");
		System.out.println(c);
		Constructor[] ctor = c.getConstructors();
		for(int i = 0; i<ctor.length; i++)
			System.out.println("생성자:" +ctor[i].toString());

		Method m[] = c.getMethods();
		for(int i = 0; i<m.length; i++) {
			System.out.println("메소드:"+m[i].toString());
		}

		Class c2 = Class.forName("week2_Ex.D0702Ex160");
		Class[] parameterTypes = new Class[] {String.class};
		Constructor constuctor = c2.getConstructor(parameterTypes);
		Object obj = constuctor.newInstance(new Object[] {"REFLECT"});

		Class[] parameterTypes2 = new Class[] {String.class};
		Method method = c2.getMethod("test01",parameterTypes2);
		Object[] parameters = new Object[] {"메소드호출"};
		Object oResult = method.invoke(obj, parameters);
	
	}
		public void test01(String paramStr) {
			System.out.println("test01 메소드호출:" +paramStr);

		}
		public void test02() {	 
		}


	}