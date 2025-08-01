import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class C0801_08 {
	public static void main(String[] args) {
		// set -> 순서 X, 중복 x 2개 테이블 합쳤을때 동일한 것은 1개만 입력되도록 할때
		HashSet<E> set = newe HashSet();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		set.add(2);
		set.add(4);
		set.add(5);
		
		// Iterator사용
		Iterator it = set.iterator();
		//일회성이고 다음에 한번더 쓰려면 다시 객체선언 해야됨.
		System.out.println("----------------------");
		while(it.hasNext()) { // hasNext: 다음것이 있는지 확인
			System.out.println(it.next()); // next() 1개 가져옴
		}
		
		
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(5);
		
		// Iterator사용
		Iterator it3 = list.iterator();
		//일회성이고 다음에 한번더 쓰려면 다시 객체선언 해야됨.
		System.out.println("----------------------");
		while(it3.hasNext()) { // hasNext: 다음것이 있는지 확인
			System.out.println(it3.next()); // next() 1개 가져옴
		}
		
		
				
		
		
		
	}
}
