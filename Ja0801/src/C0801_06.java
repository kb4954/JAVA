import java.util.ArrayList;

public class C0801_06 {
	public static void main(String[] args) {
// 		wrapper클래스 - 8가지 기본타입의 객체타입을 말함.
		// 자바 - 객체 지향언어
		// boolean, char,byte,short,int,long,float,double - 객체가 아님
		ArrayList list = new ArrayList(); // 객체타입만 가능 
		int a =10; // 기본타입
		list.add(a); // 가능 -> 자동으로 객체형 변환 int -> integer형변환
		System.out.println(list.get(0));
		
		Student s = new Student(1, "홍길동");
		System.out.println(s.getName());
		
		
		
		
		
		
		//Math 클래스
		 int a = 10;
		 int b = 50;
		 int c = 30;
		 //최대값을 출력하시오 .
		 System.out.println(Math.max(a, Math.max(b, c)));
		 
		 //랜덤 메소드 
		 
		
		
//		Math.random();
//		Math.round(),Math.floor(0),Math.ceil(0);
//		
//		
		
		
		//		//StingBuffer클래스
//		StringBuffer sb = new StringBuffer("abc");
//		System.out.println(sb);
//		
//		sb.append("123");
//		System.out.println(sb);
//		
//		StringBuffer str = new StringBuffer("가");
//		for(int i=0;i<100;i++) {
//			str.append(i)
//		}
//		
//		System.out.println(str);
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		// 
//		String a = "a";
//		for(int i=0;i<100;i++) {
//			a =a +i;
//			
//		}
//		System.out.println(a); // 결과값 1개
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		String str = "16조 12345";
//		// subString - 부분으로 가져오기
//		System.out.println(str.substring(3,6));
//		System.out.println(str.substring(0,2));
//		System.out.println(str.substring(3));
//		System.out.println(str.substring(3,7));
//	
//		String[] strArr = {"abc123","a12","bc23456"};
//		//처음부터 제일 뒤에서 1칸 앞까지 출력하시오
//		for(int i=0; i<strArr.length;i++) {
//			System.out.println(strArr[i].substring(0,1));
//		}
//		
//		// 조를 출력하시오 .
//		for(int i=0; i<strArr.length;i++) {
//			System.out.println(strArr[i].substring(0,strArr[i].length()-1));
//		}
//		
		
		
	
	
	
	
	
	
	}
}
