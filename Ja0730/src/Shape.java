
public class Shape { // 도형 외형 객체

	String color = "blue";
	void draw(String sname,Point p) {
		System.out.println(sname+"도형의 그림을 그립니다.");
		System.out.printf("[ 좌표 : %d,%d ]\n",p.x,p.y);
		
		// 하단으로 그림을 그리고 로직이 더 들어가야 함.
		
	}
	// 오버로딩 - 메소드명 같고, 매개변수 타입, 개수가 다른것
	void draw(String sname,Point[] p) {
		System.out.println(sname+"도형의 그림을 그립니다.");
		for(int i=0;i<p.length;i++) {
			System.out.printf("[ 좌표 : %d,%d ]\n",p.x,p.y);
			
		}
		
	}
}
