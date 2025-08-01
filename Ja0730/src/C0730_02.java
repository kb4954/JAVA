
public class C0730_02 {
	public static void main(String[] args) {
		// 원형 그림
		Circle c1 = new Circle();
		c1.draw(c1.sname,c1.center);
		Circle c2 = new Circle(new Point(150,150),50);
		c2.draw(c2.sname, c2.center);
		
		
		//예시 아래 Point[] p 와 같음
//		StuCore[] stu = {
//				new StuScore("홍길동",100,100,100),
//				new StuScore("유관순",90,90,90)
//				
//		}
		
		// 삼각형 그림
		// 중요 - 객체넣는 방법
		Point[] p = {
				new Point(), // 객체타입 변수라서 new를 받음
				new Point(140,50),
				new Point(200,100)
			
		};
		
		Triangle t1 = new Triangle(p);
		t1.draw(t1.sname,p);
//		// 기본타입 변수
//		int [] a = {
//				1,
//				2,
//				3
//		}
//		int[] b = {1,2,3}
		// 
		
		
		
		
	}
}
