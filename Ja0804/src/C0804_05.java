import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class C0804_05 {

	public static void main(String[] args) {
//		Map<String, Object>
		Map<String, String> map = new HashMap<String, String>();
		map.put("aaa", "1111");// put = add 와 같음 추가하는 명령어 // 앞에는 키값, 뒤에는 형태
		map.put("bbb", "2222");
		map.put("ccc", "3333");
		// 맵은 컬렉션을 상속받지 않는다. Iterator 가 없음. 그래서 set 에 있는것을 가져와서 써야됨.
		
		
		Iterator iterator = map.entrySet().iterator();
		
		// key 입력하면, value 리턴
		System.out.println(map.get("aaa"));
		
		// 키 있는지 확인
		if(map.containsKey("bbb")) {
			System.out.println("있습니다.");
			
		}else {
			System.out.println("없습니다.");
		}
		
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
