package week2_Ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class D0703Ex203 {
	static HashMap phoneBook = new HashMap();

	public static void main(String[] args) {
		addPhoneNo("친구","이자바","010-111-1111");
		addPhoneNo("세탁","010-888-8888");
		printlist();

	}


	static void addGroup(String grounName) {
		if(!phoneBook.containsKey(gruopName))phoneBook.compute(groupName,new HashMap());

	}

	static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(gruopName);
		HashMap group = (HashMap)phoneBook.get(groupName);
		group.put(tel,name);
	}

	static void addPhoneNo(String name, String tel) {
		addPhoneNo("기타",name, tel);
	}

	static void printList() {
		Set set = phoneBook.entrySet();
		Iterator it = set.iterator();

		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			
			Set subSet = (HashMap)e.getValue()).entrySet();
			Iterator subit = subSet.iterator();
			
			System.out.println(" * " + e.getKey()+"[" + subSet.size()+"]");
			
			while(subit.hasNext()) {
				Map.Entry subE = (Map.Entry)subit.next();
				String telNo = (String)subE.getKey();
				String name = (String)subE.getValue();
				System.out.println(name+""+telNo);
			}
			System.out.println();
		}
	}
}