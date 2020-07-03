package week2_Ex2;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class D0703Ex196 {
	public static void main(String[] args) {
		
		/*TreeSet원소는 반드시 Comparable이어야 한다.
		 * TreeSet사용하려면 집합에 들어가는 원소가 comparable을 구현하는 유형이어야 한다.
		 * Comparator를 인자로 받아 들이는 Treeset의 오버로드된 생성자를 사용
		 */
		new D0703Ex196().go();
	}

	
	public void go() {
		//Comparable 이용
		Book b1 = new Book("How Cats Work");
		Book b2 = new Book("Remix your Body");
		Book b3 = new Book("Finding Emo");
		
		TreeSet tree = new TreeSet();
		tree.add(b1);
		tree.add(b2);
		tree.add(b3);
		//정렬되어 조회된다.
		System.out.println("1 : " + tree); // 1 : [Finding Emo, How Cats Work, Remix your Body]
		
		//Comparator이용
		
		Book2 t1 = new Book2("How Cats Work");
		Book2 t2 = new Book2("Remix your Body");
		Book2 t3 = new Book2("Finding Emo");
		
		TreeSet tree2 = new TreeSet(new BookCompare()); // Comparator를 설정.
		tree2.add(t1);
		tree2.add(t2);
		tree2.add(t3);
		
		
		//정렬되어 조회된다.
		System.out.println("2 : "+ tree2); // 2 : [Finding Emo, How Cats Work, Remix your Body]
		//첫번째 값 조회
		System.out.println("3 : "+ tree2.first()); // 3 : Finding Emo
		//마지막값 조회
		System.out.println("4 : "+ tree2.last()); // 4 : Remix your Body
		//삭제
		System.out.println("5 : " + tree2.remove(new Book2("Finding Emo"))); // 5 : true
		System.out.println("6 : " + tree2); // 6 : [How Cats Work, Remix your Body]
		tree2.add(t3);
		
		SortedSet ss = tree2.headSet(new Book2)
				
	}
}