import java.util.ArrayList;
import java.util.Comparator;
 
public class C0804_06 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList(); // 특정한 개체만 받게끔 하는것 = 제너릭스
		
		list.add(new Stu("홍길동",100,100,100));
		list.add(new Stu("유관순",90,90,100));
		list.add(new Stu("이순신",80,100,100));
		list.add(new Stu("강감찬",70,100,100));
		list.add(new Stu("김구",60,100,100));
	
		
//		list.sort(new Comparator<Stu>() {
//
//			@Override
//			public int compare(Stu o1, Stu o2) {
//				return o1.name.compareTo(o2.name);
//			}
//			
//		});
	
		for(int i=0;i<list.size();i++) {
			Stu s = (Stu)list.get(i); // 형변환
			System.out.println(s.getName());
		}


		
	
	}

}
