
public class C0730_01 extends Point {
//	상속을 시키면 Point 에 있는게 적용됨.
//	int x; // 인스턴스 변수 - 객체선언후,개별, 참조변수명.변수
//	int y;
	int z;

	public static void main(String[] args) {
		C0730_01 c = new C0730_01();
		System.out.println("x : "+c.x);
		System.out.println("z : "+c.z);
		c.x=100;
		c.add();
		
	
	}

}
