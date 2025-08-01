
public class C0729_07 {
	
	static int b; // 클래슷 변수 - 객체선언없이, 공용, 클래스명, 변수명
	int c; // 인스턴스 변수 - 객체선언 후 사용, 객체 개별 사용, 참조변수명, 변수명
	public static void main(String[] args) {
//		int a; // 초기화 안됨.
		int a =0;
		
		System.out.println("지역변수 : "+a); // 초기화가 되지 않아서 에러가 남.
		
		// 클래스변수, 인스턴스 변수 - 자동초기화가 됨. 
		System.out.println("클래스 변수 : "+b); 
		
		//
		C0729_07 cc = new C0729_07();
		System.out.println("인스턴스 변수 : "+cc.c); // 참조변수명.변수명
		
		
		
	}

}
