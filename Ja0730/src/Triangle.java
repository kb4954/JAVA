
public class Triangle extends Shape {
	String sname = "Triangle";
	Point[] p; // 배열 참조변수
	
	// 기본생성자
	Triangle(){}
	
	Triangle(Point[] p){
		this.p = p;
	}
	Triangle(Point p1,Point p2,Point p3){
		p = new Point[] {p1,p2,p3};
	}
}
