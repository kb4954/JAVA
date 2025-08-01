
public class C0729_03 {

	public static void main(String[] args) {
		Card c = new Card();
		System.out.println(c.number);
		
		
		//		int a= 10;
//		int a = 5;
//		인스턴스  - 객체 선언 후 사용
//		MyMath m = new MyMath();
//		m.add(); // 인스턴스 메소드 - 객체선언 후 사용
//		m.a = 100; // 인스턴스 변수 - 객체선언 후 사용
//		m.b = 50;
//		System.out.println(m.add());
//		
		System.out.println(1);
		System.out.println("2");
		System.out.println('3');
		System.out.println(flase);
//		

	}
	
	
	static void add(int a, String b) {
		System.out.println(a);
		System.out.println(b);
	}
	
	static void add(int a) {
		System.out.println(a);
	}
	
	static void add(char a) {
		System.out.println(a);
	}
	
	static void add(boolean a) {
		System.out.println(a);
	}
	
	// 클래스 매서드에서는 인스턴스 메서드와 변수 둘다  호출 할 수 없다. 
	// 
}
